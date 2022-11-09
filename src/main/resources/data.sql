drop table if exists empleados;

create table empleados (
id int auto_increment primary key,
nombre varchar(100),
trabajo varchar(100),
salario int);

insert into empleados (nombre, trabajo, salario) values 
("Leo Messi", "Software architect", 150000), ("Lautaro Martínez", "Java Dev Jr", 21000), 
("Pepe Gaviota", "Java Dev Sr", 45000), ("Ricardo Fort", "Java Dev Jr", 21000), ("Lautaro Acosta", "Java Dev Sr", 45000); 