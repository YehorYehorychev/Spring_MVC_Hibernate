USE my_db;

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO my_db.users (username, password, enabled)
VALUES
	('yehor', '{bcrypt}$2a$10$lb.PQCZhQojmciqvW9PMY.7U7Uul4U8SPo4r1fgA.ulrZEyhm2f9G', 1),
	('tanya', '{bcrypt}$2a$10$5iUcoSlzY.kMySZ9CUqHyuFezNCJq71K/HT5akRFpha2sWBR4okNy', 1),
	('mike', '{bcrypt}$2a$10$Jc3uWHYN7XBS6xDXtcYu.OIBYe2XhhMgYwibBVllJ0pdJE.asvBc2', 1);
    
INSERT INTO my_db.authorities (username, authority)
VALUES
	('yehor', 'ROLE_EMPLOYEE'),
	('tanya', 'ROLE_HR'),
    ('mike', 'ROLE_HR'),
	('mike', 'ROLE_MANAGER');