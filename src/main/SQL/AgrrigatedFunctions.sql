-- FIND OUT SALARY AND DAILY SALARY OF EMPLOYEE

SELECT salary, Round(salary /30),
            Round(salary /30 , 3)
from employees;


-- MULTI ROW FUNCTIONS  | GROUP FUNCTIONS | AGGREGATE FUNCTIONS
-- COUNT , MAX , MIN , SUM , AVG

-- You can use COUNT function either with * or column name
-- when used with * it will just return the row count
-- when used with column name it will return non-null row count only


SELECT COUNT(*) from employees;

SELECT COUNT(DEPARTMENT_ID)
FROM employees;

SELECT COUNT(DEPARTMENT_ID)
FROM employees
WHERE DEPARTMENT_ID = 90;

SELECT MAX(SALARY)
FROM employees;

SELECT FIRST_NAME,MAX(SALARY)
FROM employees
Group by FIRST_NAME;



---- FIND OUT THE MAX SALARY IN EMPLOYEES TABLE
--- EXCLUDE THE SALARY 24000

SELECT MAX(SALARY)
FROM EMPLOYEES
WHERE SALARY <> 24000;


-- MIN
--- FIND OUT MINIMUM SALARY IN EMPLOYEES TABLE
SELECT MIN(SALARY)
FROM EMPLOYEES ;

-- SUM
-- GET THE SUM OF ENTIRE EMPLOYEES SALARY
SELECT SUM(SALARY)
FROM EMPLOYEES ;

-- GET THE SUM OF ENTIRE EMPLOYEES SALARY FOR DEPARTMENT_ID 90
SELECT SUM(SALARY)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90 ;

-- AVG
-- FIND OUT AVERAGE SALARY FOR ALL EMPLOYEES
SELECT AVG(SALARY) , ROUND(   AVG(SALARY)    )
FROM EMPLOYEES ;


--- ALL IN ONE SHOT
SELECT COUNT(*)  AS "EMPLOYEE COUNT" ,
       MAX(SALARY) AS "HIGHEST SALARY",
       MIN(SALARY) AS "LOWEST SALARY",
       SUM(SALARY) AS "SUM OF ALL SALARY",
       AVG(SALARY) AS "AVERAGE SALARY"
FROM EMPLOYEES ;