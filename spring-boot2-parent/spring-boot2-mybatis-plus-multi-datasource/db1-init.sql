-- for db1

drop table if exists user;

create table user (
  id bigint not null AUTO_INCREMENT,
  create_time TIMESTAMP default CURRENT_TIMESTAMP,
  username varchar(50) not null COMMENT '用户名',
  password varchar(500) not null COMMENT '密码',
  enabled tinyint(1) not null COMMENT '是否启用',
  primary key (id)
) ENGINE=InnoDB default CHARSET=utf8mb4 COMMENT='用户表';

INSERT INTO user (username, password, enabled)
VALUES
	('老王', '123456', 1);

