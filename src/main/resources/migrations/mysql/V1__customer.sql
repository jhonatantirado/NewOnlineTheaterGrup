CREATE TABLE customer (
  customerID BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  status INT NOT NULL,
  statusExpirationDate DATE NOT NULL,
  moneySpent DOUBLE,
  PRIMARY KEY(customerID)

) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


INSERT INTO customer(customerID, NAME, email, STATUS,statusExpirationDate,moneySpent) VALUES(2,'Juan', 'jgsistem@gmail.com',1,'1995-01-29',1);