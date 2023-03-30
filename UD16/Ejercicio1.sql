/* Insert into fabricantes */
INSERT INTO fabricantes (codigo) VALUES ('MSI');
INSERT INTO fabricantes (codigo) VALUES ('ASUS');
INSERT INTO fabricantes (codigo) VALUES ('NVIDIA');
INSERT INTO fabricantes (codigo) VALUES ('HP');

/* Insert into articulos */
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX1060", 500, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX1070", 750, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX1080", 1000, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX1090", 1250, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX2060", 1500, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX2070", 1750, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX2080", 2000, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX2090", 2250, 1);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX4070", 3000, 3);
INSERT INTO articulos (nombre, precio, fabricante)VALUES ("GTX4080", 3500, 3);

/* 1.1 */
SELECT nombre FROM articulos;

/* 1.2 */
SELECT nombre, precio FROM articulos;

/* 1.3 */
SELECT nombre FROM articulos WHERE precio <= 200;

/* 1.4 */
SELECT * FROM articulos WHERE precio BETWEEN 60 AND 120;

/* 1.5 */
SELECT nombre, precio*166.386 AS 'Precio en pesetas'
FROM articulos;

/* 1.6 */
SELECT AVG(precio) AS 'Precio medio' FROM articulos;

/* 1.7 */
SELECT AVG(precio) AS 'Precio medio' FROM articulos WHERE fabricante=2;

/* 1.8 */
SELECT COUNT(codigo) FROM articulos WHERE precio>180;

/* 1.9 */
SELECT nombre, precio FROM articulos WHERE precio>=180
ORDER BY precio DESC, nombre ASC;

/* 1.10 */
SELECT * FROM articulos, fabricantes 
WHERE articulos.fabricante=fabricantes.codigo;

/* 1.11 */
SELECT articulos.nombre, precio, fabricantes.nombre
FROM articulos, fabricantes
WHERE articulos.fabricante=fabricantes.codigo;

/* 1.12 */
SELECT fabricante, AVG(precio) AS 'Precio medio' FROM articulos
GROUP BY fabricante;

/* 1.13 */
SELECT fabricantes.nombre, AVG(precio) AS 'Precio Medio'
FROM articulos, fabricantes
WHERE articulos.fabricante=fabricantes.codigo
GROUP BY fabricantes.codigo;

/* 1.14 */
SELECT fabricantes.nombre
FROM fabricantes, articulos
WHERE fabricantes.codigo=articulos.fabricante
GROUP BY fabricantes.codigo
HAVING AVG(precio)>150;

/* 1.15 */
SELECT nombre, precio FROM articulos
WHERE precio = (SELECT MIN(precio) FROM articulos);

/* 1.16 */
SELECT articulos.nombre, articulos.precio, fabricantes.nombre AS 'fabricante' FROM articulos
INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo
WHERE articulos.precio = (
  SELECT MAX(precio) FROM articulos 
  WHERE fabricante = fabricantes.codigo
)
ORDER BY fabricantes.nombre ASC;

/* 1.17 */
INSERT articulos (nombre, precio, fabricante) VALUES ('Altavoces', 70, 2);

/* 1.18 */
UPDATE articulos SET nombre='Impresora Láser' WHERE codigo=8;

/* 1.19 */
UPDATE articulos SET articulos.precio=articulos.precio*0.9;

/* 1.20 */
UPDATE articulos SET precio=precio-10 WHERE precio >= 120;


































