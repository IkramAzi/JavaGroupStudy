---- GROUP BY: divides the rows into group
-- CAN BE USED ALONG WITH MULTI-ROW(AGGREGATE, GROUP) FUNCTIONS
-- TO GENERATE RESULT PER GROUP INSTEAD OF WHOLE TABLE
-- IT CAN ONLY BE USED ALONG WITH MULTI-ROW FUNCTIONS
-- CAN NOT BE USED BY ITSELF


-- DISPLAY COUNT OF EMPLOYEES IN EACH DEPARTMENT

SELECT DEPARTMENT_ID, COUNT(*)
from employees
group by DEPARTMENT_ID;

--- DISPLAY THE MAX SALARY FOR EACH DEPARTMENT
--- DISPLAY THE AVG SALARY FOR EACH DEPARTMENT
--- DISPLAY THE SUM SALARY FOR EACH DEPARTMENT

SELECT DEPARTMENT_ID,
       MAX(SALARY) as HIGHEST,
       MIN(SALARY) as LOWEST,
       Round (AVG(SALARY),2) as AVG,
 --AVG(SALARY) as AVG,
       SUM(SALARY) as Total_Salary
from employees
GROUP by DEPARTMENT_ID;

-- DISPLAY COUNT OF EMPLOYEES IN EACH JOB_ID
SELECT JOB_ID, COUNT(*)
from employees
GROUP BY JOB_ID;

-- USING COUNTRIES
-- DISPLAY COUNT OF COUNTRIES IN EACH REGION
SELECT REGION_ID, COUNT(*) AS "COUNT_OF_COUNTRIES"
from COUNTRIES
group by REGION_ID;


--Having:

select JOB_ID, COUNT(*) from employees group by JOB_ID;

select JOB_ID, Count(*) from employees
group by JOB_ID having max(salary) > 2000;


select JOB_ID, Count(*) from employees group by JOB_ID having min(salary) > 2000;

select JOB_ID, Count(*) from employees group by JOB_ID having avg(salary) > 2000;


