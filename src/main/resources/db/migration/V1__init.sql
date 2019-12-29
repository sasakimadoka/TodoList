CREATE TABLE todos (
  id int(255) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  expire_at datetime ,
  status int(255) NOT NULL,
  is_deleted int(255) NOT NULL,
  created_at datetime default current_timestamp NOT NULL,
  updated_at timestamp default current_timestamp on update current_timestamp NOT NULL ,
  color_label varchar(255),
  PRIMARY KEY (id)utf8;
) ENGINE=InnoDB DEFAULT CHARSET=