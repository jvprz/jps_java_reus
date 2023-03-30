/* 3.1 */
SELECT * FROM almacenes;

/* 3.2 */
SELECT * FROM cajas WHERE valor > 150;

/* 3.3 */
SELECT DISTINCT contenido FROM cajas;

/* 3.4 */
SELECT AVG(valor) AS 'Valor medio' FROM cajas;

/* 3.5 */
SELECT almacen, AVG(valor) AS 'Valor medio' FROM cajas GROUP BY almacen;

/* 3.6 */
SELECT almacen, AVG(valor) FROM cajas
GROUP BY Almacen
HAVING AVG(valor) > 150;

/* 3.7 */
SELECT numReferencia, lugar FROM almacenes, cajas
WHERE almacenes.codigo = cajas.almacen;

/* 3.8 */
SELECT almacen, COUNT(*) FROM cajas
GROUP BY almacen;

/* 3.9 */
SELECT codigo FROM almacenes
WHERE capacidad < (
	SELECT COUNT(*) FROM cajas 
	WHERE almacen = codigo
);

/* 3.10 */
SELECT numReferencia FROM cajas 
WHERE almacen IN (
	SELECT codigo FROM almacenes 
	WHERE lugar = 'Bilbao'
);

/* 3.11 */
INSERT INTO almacenes(lugar, capacidad) VALUES('Barcelona', 3);

/* 3.12 */
INSERT INTO cajas VALUES('H5RT', 'Papel', 200, 2);

/* 3.13 */
UPDATE cajas SET valor = valor * 0.85;

/* 3.14 */
UPDATE cajas SET valor = valor * 0.80
WHERE valor > (
	SELECT AVG(valor) FROM cajas
);

/* 3.15 */
DELETE FROM cajas WHERE valor < 100;

/* 3.16 */
DELETE FROM cajas WHERE almacen IN (
	SELECT codigo FROM almacenes WHERE capacidad < (
		SELECT COUNT(*) FROM cajas WHERE almacen = codigo 
));