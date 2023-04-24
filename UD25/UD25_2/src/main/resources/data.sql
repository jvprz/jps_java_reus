DROP IF EXISTS departamentos;

CREATE TABLE departamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    presupuesto INT
);

DROP TABLE IF EXISTS empleados;

CREATE TABLE Empleados(
    id INT AUTO_INCREMENT PRIMARY KEY,
    dni VARCHAR(9) NOT NULL UNIQUE,
    nombre VARCHAR(100),
    apellidos VARCHAR(255),
    Departamento INT,
    FOREIGN KEY (Departamento) REFERENCES Departamentos (id)
);

INSERT INTO departamentos (nombre, presupuesto) VALUES ('RRHH', 1000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('I+D', 50000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('IT', 2000);

INSERT INTO Empleados (dni, nombre, apellidos, Departamento) VALUES('12345678A', 'Javier', 'Perez', 1);
INSERT INTO Empleados (dni, nombre, apellidos, Departamento) VALUES('12345678B', 'Pedro', 'Pascal', 2);