CREATE TABLE IF NOT EXISTS facultades(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS equipos(
	id CHAR(4) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	facultad INT NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_facultad_equipo FOREIGN KEY (facultad) REFERENCES facultades (id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS investigadores(
	dni VARCHAR(9) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	facultad INT NOT NULL,
	PRIMARY KEY(dni),
	CONSTRAINT FK_facultad_investigador FOREIGN KEY (facultad) REFERENCES facultades(id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS reservas(
	id INT NOT NULL AUTO_INCREMENT,
	equipo CHAR(4) NOT NULL,
	investigador VARCHAR(9) NOT NULL,
	comienzo DATETIME NOT NULL,
	fin DATETIME NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_equipo FOREIGN KEY (equipo) REFERENCES equipos (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_investigador FOREIGN KEY (investigador) REFERENCES investigadores (dni)
	ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO facultades(nombre) VALUES ('Arquitectura');
INSERT INTO facultades(nombre) VALUES ('Artes y diseño');
INSERT INTO facultades(nombre) VALUES ('Ciencias');
INSERT INTO facultades(nombre) VALUES ('Ciencias Politicas y sociales');
INSERT INTO facultades(nombre) VALUES ('Economía');

INSERT INTO equipos(id, nombre, facultad) VALUES ('E1', 'Equipo 1', 1);
INSERT INTO equipos(id, nombre, facultad) VALUES ('E2', 'Equipo 2', 2);
INSERT INTO equipos(id, nombre, facultad) VALUES ('E3', 'Equipo 3', 3);
INSERT INTO equipos(id, nombre, facultad) VALUES ('E4', 'Equipo 4', 4);
INSERT INTO equipos(id, nombre, facultad) VALUES ('E5', 'Equipo 5', 5);

INSERT INTO investigadores(dni, nombre, facultad) VALUES ('12345678A', 'Rocket Racoon', 1);
INSERT INTO investigadores(dni, nombre, facultad) VALUES ('12345678B', 'Groot', 2);
INSERT INTO investigadores(dni, nombre, facultad) VALUES ('12345678C', 'Gamora', 3);
INSERT INTO investigadores(dni, nombre, facultad) VALUES ('12345678D', 'Drax', 4);
INSERT INTO investigadores(dni, nombre, facultad) VALUES ('12345678E', 'Star-Lord', 5);

INSERT INTO reservas(equipo, investigador, comienzo, fin) VALUES ('E1', '12345678A', '2022-01-01 00:00:00', '2022-01-02 00:00:00');
INSERT INTO reservas(equipo, investigador, comienzo, fin) VALUES ('E2', '12345678B', '2022-01-01 00:00:00', '2023-01-02 00:00:00');
INSERT INTO reservas(equipo, investigador, comienzo, fin) VALUES ('E3', '12345678C', '2022-01-01 00:00:00', '2024-01-02 00:00:00');
INSERT INTO reservas(equipo, investigador, comienzo, fin) VALUES ('E4', '12345678D', '2022-01-01 00:00:00', '2023-01-02 00:00:00');
INSERT INTO reservas(equipo, investigador, comienzo, fin) VALUES ('E5', '12345678E', '2022-01-01 00:00:00', '2022-01-02 00:00:00');