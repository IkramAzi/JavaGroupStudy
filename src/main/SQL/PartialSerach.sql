-- DISPLAY ALL THE FIRST_NAME THAT START WITH LETTER A IN EMPLOYEES TABLES

SELECT FIRST_NAME
from employees
where FIRST_NAME like 'A%';

SELECT FIRST_NAME
from employees
where FIRST_NAME not like 'A%';

SELECT FIRST_NAME
from employees
where FIRST_NAME like '%a';

SELECT FIRST_NAME
from employees
where FIRST_NAME like '%a%';

SELECT FIRST_NAME
from employees
where FIRST_NAME like '%a____';

SELECT FIRST_NAME
from employees
where FIRST_NAME like 'A____a';

SELECT PHONE_NUMBER FROM EMPLOYEES
-- WHERE PHONE_NUMBER LIKE '515%'  ; --Starts with 515 -- 21
WHERE PHONE_NUMBER LIKE '%.121.%'  ; --contains with 121 --