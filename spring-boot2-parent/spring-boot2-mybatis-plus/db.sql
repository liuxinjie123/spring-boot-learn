drop table if exists user;

CREATE TABLE user (
  id bigint(20) NOT NULL COMMENT '主键ID',
  create_time TIMESTAMP default CURRENT_TIMESTAMP,
  name varchar(30) DEFAULT NULL COMMENT '姓名',
  age int(11) DEFAULT NULL COMMENT '年龄',
  email varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO user (id, name, age, email)
VALUES
	(1, 'dream', 18, '112232232@qq.com'),
	(2, 'hello', 20, 'hellojava@163.com');