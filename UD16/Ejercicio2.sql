/* 2.1 */
SELECT empleados.apellidos FROM empleados;

/* 2.2 */
SELECT DISTINCT empleados.apellidos FROM empleados;

/* 2.3 */
SELECT * FROM empleados WHERE empleados.apellidos = 'Smith';

/* 2.4 */
SELECT * FROM empleados WHERE empleados.apellidos = 'Smith' OR empleados.apellidos = 'Rogers';

/* 2.5 */
SELECT * FROM empleados WHERE empleados.departamento = 14;

/* 2.6 */
SELECT * FROM empleados WHERE empleados.departamento = 37 OR empleados.departamento = 77;

/* 2.7 */
SELECT * FROM empleados WHERE empleados.apellidos LIKE 'p%';

/* 2.8 */
SELECT SUM(departamentos.presupuesto) FROM departamentos;

/* 2.9 */
SELECT departamento, COUNT(*) FROM empleados
GROUP BY departamento;

/* 2.10 */
SELECT * FROM empleados, departamentos
WHERE empleados.departamento = departamentos.codigo;

/* 2.11 */
SELECT empleados.nombre, empleados.nombre, departamentos.nombre, departamentos.presupuesto FROM empleados, departamentos
WHERE empleados.departamento = departamentos.codigo;

/* 2.12 */
SELECT empleados.nombre, apellidos FROM empleados, departamentos
WHERE empleados.departamento = departamentos.codigo
AND departamentos.presupuesto > 60000;

/* 2.13 */
SELECT * FROM departamentos
WHERE departamentos.presupuesto > (
	SELECT AVG(presupuesto) FROM departamentos 
);

/* 2.14 */
SELECT nombre FROM departamentos WHERE codigo IN (
	SELECT departamento FROM empleados
		GROUP BY departamento
		HAVING COUNT(*) > 2 
);

/* 2.15 */
INSERT INTO departamentos (nombre, presupuesto) VALUES ('Calidad' , 40000);

/* 2.16 */
UPDATE departamentos SET departamentos.presupuesto = departamentos.presupuesto * 0.9;

/* 2.17 */
UPDATE empleados SET departamento = 14 WHERE departamento = 77;

/* 2.18 */
DELETE FROM empleados WHERE departamento = 14;

/* 2.19 */
DELETE FROM empleados WHERE departamento IN (
	SELECT departamentos.codigo FROM departamentos 
    WHERE departamentos.presupuesto >= 60000
);

/* 2.20 */
DELETE FROM empleados;