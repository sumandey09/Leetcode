# Write your MySQL query statement below
delete p
from Person p
join Person s
where p.email=s.email and p.id>s.id;