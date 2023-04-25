CREATE TABLE almacenes (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    lugar VARCHAR(100) DEFAULT NULL,
    capacidad INT DEFAULT NULL
);

CREATE TABLE cajas (
    numReferencia INT AUTO_INCREMENT PRIMARY KEY,
    contenido VARCHAR(100) DEFAULT NULL,
    valor INT DEFAULT NULL,
    almacen INT,
    FOREIGN KEY (almacen) REFERENCES almacenes(codigo)
)

INSERT INTO almacenes (lugar, capacidad) values ('Barcelona', 10000);
INSERT INTO almacenes (lugar, capacidad) values ('Tarragona', 20000);
INSERT INTO almacenes (lugar, capacidad) values ('Castellon', 30000);
INSERT INTO almacenes (lugar, capacidad) values ('Valencia',  40000);