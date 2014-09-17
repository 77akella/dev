CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(300) NOT NULL,
  create_date datetime NOT NULL,
  email varchar(255) NOT NULL UNIQUE,
  password_hash varchar(255) NOT NULL,
  status int NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE roles (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE user_roles (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int NOT NULL,
  role_id int NOT NULL,
  CONSTRAINT FOREIGN KEY (user_id) REFERENCES users (id),
  CONSTRAINT FOREIGN KEY (role_id) REFERENCES roles (id),
  CONSTRAINT UNIQUE(user_id, role_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO roles (name) values("ADMIN");
INSERT INTO roles (name) values("CONSUMER");
INSERT INTO roles (name) values("CRAFTSMAN");
