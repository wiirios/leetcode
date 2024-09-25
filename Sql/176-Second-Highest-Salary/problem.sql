# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary FROM employee WHERE salary < (select MAX(salary) FROM employee)