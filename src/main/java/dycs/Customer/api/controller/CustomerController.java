package dycs.Customer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import dycs.Customer.application.assembler.CustomerCreateAssembler;
import dycs.Customer.application.dto.CustomerCreateDto;
import dycs.Customer.application.validation.CustomerCreateValidation;
import dycs.Customer.domain.entity.Customer;
import dycs.Customer.domain.repository.CustomerRepository;
import dycs.Customer.infrastructure.persistence.hibernate.CustomerHibernateRepository;
import dycs.common.application.ApiResponseHandler;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
	
	
	@Autowired
	CustomerHibernateRepository customerHibernateRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Autowired
	CustomerCreateValidation customerCreateValidation;
	
	@Autowired
	ApiResponseHandler apiResponseHandler;	
	
	@Autowired
	CustomerCreateAssembler customerCreateAssembler;
	
	@Transactional(rollbackFor=Exception.class, isolation = Isolation.READ_COMMITTED)
	@RequestMapping(
	    method = RequestMethod.POST,
	    path = "",
	    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, 
	    produces = MediaType.APPLICATION_JSON_UTF8_VALUE
	)
	public ResponseEntity<Object> create(@RequestBody CustomerCreateDto customerCreateDto) throws Exception {
        try {
        	
        	customerCreateValidation.validate(customerCreateDto);
            Customer customer = customerCreateAssembler.toEntity(customerCreateDto);
            customerHibernateRepository.create(customer);
            CustomerCreateDto customerCreateDto2 = customerCreateAssembler.toDto(customer);
            return new ResponseEntity<Object>(customerCreateDto2, HttpStatus.CREATED);
        } catch(IllegalArgumentException ex) {
        	ex.printStackTrace();
        	return new ResponseEntity<Object>(apiResponseHandler.getApplicationError(ex.getMessage()), HttpStatus.BAD_REQUEST);
        } catch(Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Object>(apiResponseHandler.getApplicationException(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	
}
