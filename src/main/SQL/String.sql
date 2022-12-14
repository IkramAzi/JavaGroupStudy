--- SQL BUILT-IN FUNCTIONS :
--- REUSABLE CODE THAT WRAPPED INTO FUNCTION FOR COMMON TASKS
-- LIKE ROUNDING NUMBERS , GETTING LENGTH OF STR AND MORE
-- SINGLE ROW FUNCTION :
-- IT AFFECT EACH AND EVERY ROW AND RETURN SAME NUMBER OF ROW

-- FEW TEXT FUNCTIONS :
-- UPPER :  ACCEPT ONE PARAMETER (COLUMN NAME) AND RETURN UPPERCASE
-- LOWER : ACCEPT ONE PARAMETER (COLUMN NAME) AND RETURN LOWERCASE
-- LENGTH: RETURN THE LENGTH OF STRING

-- Display FIRST_NAME
-- , and UPPERCASE, LOWER FIRST NAME , LENGTH OF FIRST_NAME
-- IN EMPLOYEE TABLE

SELECT UPPER(FIRST_NAME), LOWER(last_name), LENGTH(FIRST_NAME)
from employees;



-- SELECT trim ('   Hello    ');
-- SELECT trim ('   Hello    ');
--
-- SELECT length ('    Hello    ');
--
-- SELECT length ( (Trim('  Hello  '));

SELECT email from employees;

--Concatenation operator: ||
SELECT 'www.' ||email || '@gmail.com' from employees;

SELECT FIRST_NAME ||' '|| EMPLOYEES.LAST_NAME FROM employees;

-- InitCapital
select initcap(email) from employees;


--replace(ColumnName, OldValue, NewValue)
select FIRST_NAME from employees;
select replace(FIRST_NAME, 'e','A') from employees;

--substring(columnName, beginning index, end index)
select FIRST_NAME from employees;
select FIRST_NAME, substr(FIRST_NAME, 0,1) from employees;

select  substr(FIRST_NAME, 0,1) || substr(last_name, 0,1) from employees;

--trim(Value)
select FIRST_NAME from employees;
select concat( '    ',FIRST_NAME) from employees;
select trim(concat( '    ',FIRST_NAME)) from employees;




















-- ONLY DISPLAY IF FIRST NAME CHARACTER COUNT IS MORE THAN 10
SELECT FIRST_NAME, LENGTH(FIRST_NAME)
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) > 10 ;

-- ONLY DISPLAY IF FIRST NAME CHARACTER COUNT BETWEEN 7-9
SELECT FIRST_NAME, LENGTH(FIRST_NAME)
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) BETWEEN 7 AND 9 ;

-- ONLY DISPLAY IF FIRST NAME CHARACTER COUNT NOT BETWEEN 5-10
SELECT FIRST_NAME, LENGTH(FIRST_NAME)
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) NOT BETWEEN 5 AND 10 ;


-- ONLY DISPLAY IF FIRST NAME CHARACTER COUNT IS 2 OR 9 OR 11
SELECT FIRST_NAME, LENGTH(FIRST_NAME)
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) IN (2,9,11) ;

-- FIND OUT ALL FIRST_NAME THAT CONTAINS d or D
SELECT FIRST_NAME , UPPER(FIRST_NAME)
FROM EMPLOYEES
-- WHERE FIRST_NAME LIKE '%D%' OR FIRST_NAME LIKE '%d%' ;
WHERE UPPER(FIRST_NAME) LIKE '%D%' ;

SELECT SUBSTR (FIRST_NAME, 0,3)
FROM EMPLOYEES;

SELECT REPLACE (LAST_NAME, 'A' ,'B')
FROM EMPLOYEES;

SELECT INSTR (LAST_NAME, 'b')
FROM EMPLOYEES;

SELECT FIRST_NAME ||''|| LAST_NAME
FROM EMPLOYEES;