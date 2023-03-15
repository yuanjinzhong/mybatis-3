create table if not exists study.user_info
(
  id          bigint auto_increment
  primary key,
  name        varchar(32)       not null,
  age         int               not null,
  sex         tinyint default 1 not null,
  create_time datetime          not null,
  update_time datetime          not null
  )
  comment '用户表';



INSERT INTO study.user_info (id, name, age, sex, create_time, update_time) VALUES (1, '张三', 12, 1, '2021-12-27 14:05:51', '2021-12-27 14:05:51');
INSERT INTO study.user_info (id, name, age, sex, create_time, update_time) VALUES (2, '22222', 12, 1, '2022-02-07 17:35:57', '2022-02-07 17:35:57');
