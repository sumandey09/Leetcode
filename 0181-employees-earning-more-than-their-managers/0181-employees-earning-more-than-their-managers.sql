# Write your MySQL query statement below
SELECT a.name Employee
FROM Employee a 
JOIN Employee b
ON a.managerID=b.id
WHERE a.salary>b.salary;