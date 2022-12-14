-- SUB QUERY : QUERY INSIDE ANOTHER QUERY


-- FIND OUT MAX SALARY FROM EMPLOYEES
SELECT max(salary)
from employees;

SELECT FIRST_NAME
FROM EMPLOYEES
WHERE SALARY = 24000 ;

SELECT FIRST_NAME, LAST_NAME
FROM employees
WHERE SALARY = (SELECT MAX(salary) FROM employees);

SELECT SALARY
FROM employees
WHERE SALARY = (SELECT MAX(salary) FROM employees);

SELECT FIRST_NAME, LAST_NAME
FROM employees
WHERE SALARY <(SELECT MAX(salary) FROM employees);

SELECT MAX( SALARY)
FROM employees
WHERE SALARY <(SELECT MAX(salary) FROM employees);

-- FIND OUT THE NAME OF THE EMPLOYEE THAT MAKE LEAST SALARY
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY =  ( SELECT MIN(SALARY) FROM EMPLOYEES ) ;

-- FIND OUT THE NAME , SALARY OF THE EMPLOYEES THAT MAKE MORE THAN AVERAGE SALARY
SELECT AVG(SALARY) FROM EMPLOYEES ;
SELECT Round(AVG(SALARY),2) FROM EMPLOYEES ;

SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY > (SELECT AVG(SALARY )FROM employees);

--- DISPLAY ALL EMPLOYEES IF SALARY IS NOT 24000
--- AND FIND MAX
-- ALSO KNOWN AS (AKA) SECOND MAX SALARY

SELECT MAX(SALARY)
FROM employees
WHERE SALARY < (SELECT MAX(SALARY)
FROM employees
    WHERE SALARY != ( SELECT MAX(SALARY) FROM EMPLOYEES ) );



-- FIND OUT THE EMPLOYEE COUNT OF THE DEPARTMENT WITH MOST EMPLOYEE
SELECT DEPARTMENT_ID, COUNT(*) AS EMPLOYEE_COUNT
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID ;

--- -- FIND OUT THE EMPLOYEE COUNT OF THE DEPARTMENT WITH MOST EMPLOYEE
SELECT MAX(EMPLOYEE_COUNT)
FROM (SELECT DEPARTMENT_ID, COUNT(*) AS EMPLOYEE_COUNT
      FROM EMPLOYEES
      GROUP BY DEPARTMENT_ID) ;

CREATE TABLE EMP_SALARY_RANK AS (

    SELECT FIRST_NAME, SALARY ,
           DENSE_RANK() OVER (ORDER BY SALARY DESC) AS SALARY_RANK
    FROM EMPLOYEES

) ;

SELECT * FROM EMP_SALARY_RANK
WHERE SALARY_RANK = 4 ;

----  100 , 34, 88 , 90 , 55 , 100
----   5     1   3    4   2  ,  5