CREATE TABLE todos (
  id int(255) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  expire_date date ,
  label ,
  status int(255) NOT NULL,
  is_deleted int(255) NOT NULL,
  create_date date NOT NULL,
  update_date date NOT NULL,
  color_label varchar(255)
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;