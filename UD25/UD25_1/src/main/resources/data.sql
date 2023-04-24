DROP table IF EXISTS fabricantes;

CREATE TABLE fabricantes(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
  	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS articulos;

CREATE TABLE articulos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	precio INT,
	fabricante INT,
    FOREIGN KEY (fabricante) REFERENCES fabricantes (id)
);

insert into fabricantes (nombre) values ('MSI');
insert into fabricantes (nombre) values ('GIGABYTE');
insert into fabricantes (nombre) values ('ASUS');
insert into fabricantes (nombre) values ('Logitech');
insert into fabricantes (nombre) values ('Microsoft');


insert into articulos (nombre, precio, fabricante) values ('RTX 4090', 2000, 1);
insert into articulos (nombre, precio, fabricante) values ('RTX 3080', 1000, 2);
insert into articulos (nombre, precio, fabricante) values ('RTX 2070', 500, 3);
insert into articulos (nombre, precio, fabricante) values ('G Pro X', 100, 4);
insert into articulos (nombre, precio, fabricante) values ('Xbox series X/S controller', 50, 5);