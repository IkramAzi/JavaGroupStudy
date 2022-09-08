--- ARITHMETIC OPERATION : + - * /
-- Display EMPLOYEE FIRST_NAME AND SALARY
-- AND INCREASED_SALARY AFTER 5000$ RAISE

SELECT FIRST_NAME, last_name, salary,
       salary + 5000 as INCREASED_SALARY
from employees;

SELECT FIRST_NAME, last_name, salary,
       salary * 5000 as INCREASED_SALARY
from employees;

SELECT FIRST_NAME, last_name, salary,
       salary / 5000 as INCREASED_SALARY
from employees;

SELECT FIRST_NAME, last_name, salary,
       salary - 5000 as Decrease_Salary
from employees;
