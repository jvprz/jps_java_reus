DROP TABLE IF EXISTS empleados;

CREATE TABLE empleados (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(250) NOT NULL,
	trabajo VARCHAR(250) NOT NULL
);

INSERT INTO empleados (nombre, trabajo) VALUES ('Javier', 'Test 1');
INSERT INTO empleados (nombre, trabajo) VALUES ('Pedro', 'Test 2');
INSERT INTO empleados (nombre, trabajo) VALUES ('Iván', 'Test 3');