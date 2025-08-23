# Write your MySQL query statement below
SELECT s.name Customers
FROM Customers s
WHERE id not in
(select customerId from orders);
