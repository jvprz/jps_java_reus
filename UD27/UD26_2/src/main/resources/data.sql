CREATE TABLE IF NOT EXISTS cientificos(
	dni VARCHAR(9) NOT NULL,
	nombre_apellidos VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (dni)
);

CREATE TABLE IF NOT EXISTS proyectos(
	id CHAR(4) NOT NULL,
	nombre VARCHAR(255) DEFAULT NULL,
	horas INT DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS asignado_a(
	id INT NOT NULL AUTO_INCREMENT,
	cientifico VARCHAR(9) NOT NULL,
	proyecto CHAR(4) NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_cientifico FOREIGN KEY (cientifico) REFERENCES cientificos (dni)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_proyecto FOREIGN KEY (proyecto) REFERENCES proyectos (id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('12345678A', 'Oberyn Martell');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('12345678B', 'Din Djarin');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('12345678C', 'Joel Miller');

INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO1', 'Proyecto 1', 1);
INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO2', 'Proyecto 2', 2);
INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO3', 'Proyecto 3', 3);

INSERT INTO asignado_a(cientifico, proyecto) VALUES ('12345678A', 'PRO1');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('12345678B', 'PRO2');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('12345678C', 'PRO3');