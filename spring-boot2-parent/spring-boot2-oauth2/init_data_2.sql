drop table if exists oauth_user;

create table oauth_user (
  id bigint not null AUTO_INCREMENT,
  create_time TIMESTAMP default CURRENT_TIMESTAMP,
  username varchar(50) not null COMMENT '用户名',
  password varchar(100) not null COMMENT '密码',
  status tinyint(1) not null COMMENT '是否启用 1-启用，0-禁用',
  primary key (id),
  KEY idx_username (username),
) ENGINE=InnoDB default CHARSET=utf8mb4 COMMENT='oauth_用户表';



drop table if exists oauth_role;

create table oauth_role (
  id bigint not null AUTO_INCREMENT,
  create_time TIMESTAMP default CURRENT_TIMESTAMP,
  role_name varchar(50) not null COMMENT '角色名',
  role_desc varchar(200) not null COMMENT '角色描述',
  primary key (id),
) ENGINE=InnoDB default CHARSET=utf8mb4 COMMENT='oauth_角色表';


drop table if exists oauth_user_role;

create table oauth_user_role (
  id bigint not null AUTO_INCREMENT,
  create_time TIMESTAMP default CURRENT_TIMESTAMP,
  uid bigint not null COMMENT 'user id',
  rid bigint not null COMMENT 'role id',
  primary key (id),
) ENGINE=InnoDB default CHARSET=utf8mb4 COMMENT='oauth_用户角色对应关系表';



