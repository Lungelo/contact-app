DROP TABLE IF EXISTS contact;

CREATE TABLE contact (
id INT AUTO_INCREMENT  PRIMARY KEY,
name VARCHAR(255) NOT NULL,
phone VARCHAR(255) NOT NULL,
email VARCHAR(250) DEFAULT NULL,
address1 VARCHAR(255) DEFAULT NULL,
address2 VARCHAR(255) DEFAULT NULL,
address3 VARCHAR(255) DEFAULT NULL,
postal_code VARCHAR(255) DEFAULT NULL,
note VARCHAR(255) DEFAULT NULL
);
