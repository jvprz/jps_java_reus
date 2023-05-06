CREATE TABLE IF EXISTS piezas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF EXISTS proveedores(
	id CHAR(4) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF EXISTS suministra(
	id INT NOT NULL AUTO_INCREMENT,
	pieza INT NOT NULL,
	proveedor CHAR(4) NOT NULL,
	precio INT NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_pieza FOREIGN KEY (pieza) REFERENCES piezas (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_proveedor FOREIGN KEY (proveedor) REFERENCES proveedores (id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO piezas(nombre) VALUES ('Placa base');
INSERT INTO piezas(nombre) VALUES ('Procesador');
INSERT INTO piezas(nombre) VALUES ('Targeta grafica');
INSERT INTO piezas(nombre) VALUES ('Fuente de alimentacion');
INSERT INTO piezas(nombre) VALUES ('RAM');

INSERT INTO proveedores(id, nombre) VALUES ('C1', 'MSI');
INSERT INTO proveedores(id, nombre) VALUES ('C2', 'INTEL');
INSERT INTO proveedores(id, nombre) VALUES ('C3', 'NVIDIA');
INSERT INTO proveedores(id, nombre) VALUES ('C4', 'ASUS');

INSERT INTO suministra(pieza, proveedor, precio) VALUES (1, 'C4', 400);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (2, 'C3', 300);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (3, 'C2', 200);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (4, 'C1', 100);