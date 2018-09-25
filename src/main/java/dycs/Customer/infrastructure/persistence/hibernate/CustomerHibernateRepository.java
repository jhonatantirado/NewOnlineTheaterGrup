package dycs.Customer.infrastructure.persistence.hibernate;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import dycs.Customer.domain.entity.Customer;
import dycs.Customer.domain.repository.CustomerRepository;
import dycs.common.infrastructure.persistence.hibernate.BaseHibernateRepository;

@Transactional(rollbackOn=Exception.class)
@Repository
public class CustomerHibernateRepository extends BaseHibernateRepository<Customer> implements CustomerRepository {

	public CustomerHibernateRepository() {
		super(Customer.class);
	}
}
