Select * from employees;

SELECT FIRST_NAME
FROM employees;

--The DISTINCT keyword can be used to return only distinct (different) values.
SELECT DISTINCT FIRST_NAME
FROM employees;

SELECT DISTINCT JOB_ID
FROM employees;

--The WHERE clause appears right after the FROM clause of the SELECT statement
SELECT FIRST_NAME, salary
from employees
Where salary > 4000 and salary < 10000;

SELECT * FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven' ;


-- Display the Employee FIRST_NAME, LAST_NAME,SALARY
-- for the employee with SALARY 4800 and FIRST_NAME David

SELECT FIRST_NAME,last_name, salary
from employees
WHERE salary = 4800 and FIRST_NAME = 'David';

-- Display the Employee FIRST_NAME, LAST_NAME,SALARY
-- for the employee with SALARY 4800 OR FIRST_NAME David
-- LOGICAL OR

SELECT FIRST_NAME, LAST_NAME, salary
from employees
where salary = 4800 or FIRST_NAME = 'David';

-- RANGE CHECKING IS MUCH SIMPLER IN SQL USING
-- BETWEEN ..... AND
-- IS SAME AS  COLUMN_VALUE>= lowerLimit AND COLUMN_VALUE <= UpperLimit
-- Above query can be much simpler and more readable as below

SELECT FIRST_NAME, LAST_NAME, salary
from employees
where salary not BETWEEN 4000 and 10000;

-- USING KEYWORD IN for multiple possible value of same column in condition

SELECT FIRST_NAME, LAST_NAME, JOB_ID
FROM employees
WHERE JOB_ID IN('AD_VP', 'AD_ASST', 'FI_ACCOUNT', 'AC_ACCOUNT');

SELECT FIRST_NAME, LAST_NAME, JOB_ID
FROM employees
WHERE JOB_ID NOT IN('AD_VP', 'AD_ASST', 'FI_ACCOUNT', 'AC_ACCOUNT');

-- HOW TO SAY NOT IN SQL
-- for equality check !=  <>  ,
--- FIND OUT ALL REGIONS EXPECT THE REGION WITH REGION_ID OF 1

SELECT * FROM REGIONS
WHERE REGION_ID != 2;

--- FIND OUT ALL REGIONS EXPECT THE REGION WITH REGION_NAME OF Americas
SELECT * FROM REGIONS
WHERE REGION_NAME <> 'Americas';


-- HOW TO USE NULL IN CONDITION ?
-- FOR EXAMPLE : FIND OUT ALL DEPARTMENTS THAT DOES NOT HAVE MANAGER_ID
SELECT * from DEPARTMENTS
WHERE MANAGER_ID is null ;

SELECT * from DEPARTMENTS
WHERE MANAGER_ID is not null ;

-- SORTING THE RESULT IN ASCENDING (LOW TO HIGH )
--  OR DESCENDING ORDER(HIGH TO LOW )
-- ORDER BY Clause can be used to order the result of your query
-- It use either column name or column index
-- It must be the last part of the statement
-- ASC for (LOW TO HIGH ) by default ,
-- DESC  (HIGH TO LOW )

-- Display Employee FIRST_NAME and LAST_NAME and Salary
-- try to sort by below criteria separately
-- FIRST_NAME ASC
-- Salary DESC
-- LAST_NAME DESC

SELECT FIRST_NAME, LAST_NAME, salary
from employees
order by salary DESC;


