
--Aliases: used to give temporary names to tables and column

--column Aliases

select first_name as "Given Name" from employees;

select first_name ||' '||last_name as "Full Name" from employees;

select concat(email, '@gmail.com') as "email address" from employees;