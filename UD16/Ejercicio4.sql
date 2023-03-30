/* 4.1 */
SELECT nombre FROM peliculas;

/* 4.2 */
SELECT DISTINCT calificaion_edad FROM peliculas;

/* 4.3 */
SELECT nombre FROM peliculas WHERE calificaion_edad = null;

/* 4.4 */
SELECT nombre FROM salas WHERE salas.pelicula = null;

/* 4.5 */
SELECT salas.codigo, salas.nombre, peliculas.nombre FROM peliculas
INNER JOIN salas ON salas.pelicula = peliculas.codigo;

/* 4.6 */
SELECT peliculas.codigo, peliculas.nombre, peliculas.calificaion_edad, salas.nombre FROM salas
INNER JOIN peliculas ON peliculas.codigo = salas.codigo;

/* 4.7 */
SELECT peliculas.nombre FROM peliculas WHERE peliculas.codigo IN (
    SELECT salas.pelicula FROM salas WHERE salas.pelicula = null
);

/* 4.8 */
INSERT INTO peliculas (nombre, calificaion_edad) VALUES ('Un, Dos, Tres', 7);

/* 4.9 */
UPDATE peliculas 
SET calificaion_edad = 
    CASE 
        WHEN calificaion_edad IS NULL THEN 13
        ELSE calificaion_edad
    END;

/* 4.10 */
DELETE FROM salas WHERE salas.codigo IN (
    SELECT DISTINCT salas.codigo FROM salas 
    INNER JOIN peliculas ON salas.pelicula = peliculas.codigo 
    WHERE peliculas.calificaion_edad = null
);