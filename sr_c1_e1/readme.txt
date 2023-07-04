CREATE TABLE `test`.`Product` (
`id` INT NOT NULL,
`name` VARCHAR(45) NULL,
PRIMARY KEY (`id`));
  
INSERT INTO `test`.`Product` (`id`, `name`) VALUES ('1', 'Bananas');
INSERT INTO `test`.`Product` (`id`, `name`) VALUES ('2', 'Oranges');
  
#spring.r2dbc.url=r2dbc:mysql://localhost/test
spring.r2dbc.url=r2dbc:mysql://localhost/test?tlsVersion=TLSv1.2