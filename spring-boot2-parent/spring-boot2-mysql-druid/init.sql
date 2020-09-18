drop table if exists city;

CREATE TABLE city (
  id bigint NOT NULL AUTO_INCREMENT,
  create_time TIMESTAMP default CURRENT_TIMESTAMP,
  name varchar(32) DEFAULT NULL,
  state varchar(32) DEFAULT NULL,
  country varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO city (id, name, state, country)
VALUES
	(1, '广州16', 'GZ16', 'CH16'),
	(2, '北京17', 'BJ17', 'CH17'),
	(3, '深圳18', 'SZ18', 'CH18');