
--retrieve number of unique rows if any row has at least a single unique data.
select distinct first_name from employees;

--Who is the person getting highest salary
SELECT  first_name, salary
FROM employees
where salary = (SELECT max(salary) FROM employees);

--Who is the person second highest salary

SELECT MAX(salary)
FROM employees
WHERE SALARY < (SELECT max(salary) FROM employees);

--Who is the person 3RD highest salary
SELECT * FROM employees
WHERE salary = (SELECT * FROM (SELECT DISTINCT salary FROM employees
                               ORDER BY salary DESC) WHERE ROWNUM <=3 MINUS
                SELECT * FROM (SELECT DISTINCT salary FROM employees ORDER BY salary DESC) WHERE ROWNUM <=2);

-- NOW WE CAN SEE THIS WHOLE RESULT OF ABOVE QUERY AS A TABLE
-- SELECT FROM THIS "TABLE" AND FILTER THE RESULT
-- BY SALARY_RANK = NTH(the number you want)
SELECT *
FROM (SELECT FIRST_NAME, SALARY ,
             DENSE_RANK() OVER (ORDER BY SALARY DESC) AS SALARY_RANK
      FROM EMPLOYEES)
WHERE SALARY_RANK = 2;

SELECT *
FROM (SELECT FIRST_NAME, JOB_ID ,
             DENSE_RANK() OVER (ORDER BY JOB_ID ) AS JOBS_ID
      FROM EMPLOYEES)
WHERE JOBS_ID = 4;







-- FIND OUT THE NAME OF THE EMPLOYEE THAT MAKE LEAST SALARY
SELECT FIRST_NAME,LAST_NAME, SALARY FROM EMPLOYEES
    WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEES);

SELECT FIRST_NAME,LAST_NAME, SALARY FROM EMPLOYEES
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES);


-- FIND OUT THE NAME , SALARY OF THE EMPLOYEES THAT MAKE MORE THAN AVERAGE SALARY
SELECT FIRST_NAME,LAST_NAME, SALARY FROM EMPLOYEES
    WHERE SALARY < (SELECT AVG(SALARY) FROM EMPLOYEES);

SELECT Round(AVG(SALARY), 2) FROM EMPLOYEES;



---- DENSE_RANK FUNCTION THAT FALL INTO CATEGORY OF ANALYTICAL FUNCTIONS
-- DENSE_RANK() OVER (ORDER BY SALARY DESC)
-- IT MEANS GENERATE RANK NUMBER FOR SALARY
-- USING SALARY DESCENDING ORDER
-- max salary get 1 , second max get 2 , third max get 3 .....
SELECT FIRST_NAME, SALARY ,
       DENSE_RANK() OVER (ORDER BY SALARY DESC) AS SALARY_RANK
       --, RANK() OVER (ORDER BY SALARY DESC) AS SALARY_RANK
FROM EMPLOYEES;

SELECT * FROM Employees WHERE first_name LIKE 'A%' ;

--maximum salaries in each department?
SELECT  department_id, max(salary)
from employees
group by department_id;


--duplicate names in employees?
SELECT first_name, COUNT (first_name) FROM employees GROUP BY first_name
  HAVING (COUNT(first_name) > 1);


--how to find top 5 employees who is making highest salary→


select * from

(select * from employees order by salary desc) where rownum<6;



--how to find 14th highest salary


select min(salary) from
    (select * from employees order by salary desc) where rownum<15;



--how to find 14th highest salary no duplicates


select min(salary) from
    (select distinct salary from employees order
        by salary desc) where rownum <15;

SELECT salary from employees
ORDER by salary desc;


--find firstname lastname salary for 14th highest salary→

select first_name, last_name
from employees
where salary = (select min(salary) from
    (select * from employees order
     by salary desc) where rownum<15);


