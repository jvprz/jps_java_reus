CREATE TABLE IF NOT EXISTS cajeros(
	id INT NOT NULL AUTO_INCREMENT,
	nombre_apellidos VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS productos(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	precio INT DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS maquinas_registradoras(
	id INT NOT NULL AUTO_INCREMENT,
	piso INT DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS ventas(
	id INT NOT NULL AUTO_INCREMENT,
	cajero INT NOT NULL,
	producto INT NOT NULL,
	maquina_registradora INT NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_cajero FOREIGN KEY (cajero) REFERENCES cajeros (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_producto FOREIGN KEY (producto) REFERENCES productos (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_maquina_registradora FOREIGN KEY (maquina_registradora)
	REFERENCES maquinas_registradoras (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO cajeros(nombre_apellidos) VALUES ('Robert Downley Jr');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Chris Hemsworth');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Chris Evans');

INSERT INTO productos(nombre, precio) VALUES ('Armadura', 1000);
INSERT INTO productos(nombre, precio) VALUES ('Martillo', 2000);
INSERT INTO productos(nombre, precio) VALUES ('Escudo', 3000);

INSERT INTO maquinas_registradoras(piso) VALUES (1);
INSERT INTO maquinas_registradoras(piso) VALUES (2);
INSERT INTO maquinas_registradoras(piso) VALUES (1);

INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (1, 1, 1);
INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (2, 2, 2);
INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (3, 3, 3);
