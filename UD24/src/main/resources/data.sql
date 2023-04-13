DROP TABLE IF EXISTS empleados;

CREATE TABLE empleados (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(250) NOT NULL,
	trabajo VARCHAR(250) NOT NULL,
	salario INT DEFAULT 0
);

INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Javier', 'Test 1', 0);
INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Pedro', 'Test 2', 0);
INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Ivan', 'Test 3', 0);