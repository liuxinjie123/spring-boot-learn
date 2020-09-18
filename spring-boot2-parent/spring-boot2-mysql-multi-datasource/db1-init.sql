-- for db1

drop table if exists city;

CREATE TABLE city (
  id bigint NOT NULL AUTO_INCREMENT,
  create_time timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  name varchar(32) DEFAULT NULL,
  state varchar(32) DEFAULT NULL,
  country varchar(32) DEFAULT NULL,
  primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='城市表';

INSERT INTO city (name, state, country)
VALUES
	('广州1', 'GZ1', 'CH1'),
	('北京1', 'BJ1', 'CH1'),
	('深圳1', 'SZ1', 'CH1');