CREATE TABLE IF EXISTS peliculas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	edad_minima int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF EXISTS salas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	pelicula int DEFAULT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_pelicula FOREIGN KEY (pelicula) REFERENCES peliculas(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas(nombre, edad_minima) VALUES ('Guardians of the galaxy', 13);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Guardians of the galaxy vol.2', 13);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Guardians of the galaxy vol.3', 13);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Avengers: Infinity war', 13);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Avengers: Endgame', 13);

INSERT INTO salas(nombre, pelicula) VALUES ('Sala 1', 5);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 2', 4);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 3', 3);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 4', 2);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 5', 1);