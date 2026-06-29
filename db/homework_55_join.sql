CREATE TABLE departments (
    id BIGINT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE employees (
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    department_id BIGINT
);

INSERT INTO departments (id, name)
VALUES
    (1, 'IT'),
    (2, 'HR'),
    (3, 'Marketing');

INSERT INTO employees (id, first_name, department_id)
VALUES
    (1, 'Ivan', 1),
    (2, 'Olena', 2),
    (3, 'Petro', NULL),
    (4, 'Iryna', 99);

-- INNER JOIN: only employees with existing departments.
SELECT
    e.id AS employee_id,
    e.first_name,
    d.id AS department_id,
    d.name AS department_name
FROM employees e
INNER JOIN departments d ON e.department_id = d.id;

-- LEFT JOIN: all employees, including employees without existing departments.
SELECT
    e.id AS employee_id,
    e.first_name,
    d.id AS department_id,
    d.name AS department_name
FROM employees e
LEFT JOIN departments d ON e.department_id = d.id;

-- RIGHT JOIN: all departments, including departments without employees.
SELECT
    e.id AS employee_id,
    e.first_name,
    d.id AS department_id,
    d.name AS department_name
FROM employees e
RIGHT JOIN departments d ON e.department_id = d.id;

-- FULL JOIN: all employees and all departments.
SELECT
    e.id AS employee_id,
    e.first_name,
    d.id AS department_id,
    d.name AS department_name
FROM employees e
FULL JOIN departments d ON e.department_id = d.id;

-- FULL OUTER: returns all records from both tables. The same as FULL JOIN.
SELECT
    e.id AS employee_id,
    e.first_name,
    d.id AS department_id,
    d.name AS department_name
FROM employees e
FULL OUTER JOIN departments d ON e.department_id = d.id;
