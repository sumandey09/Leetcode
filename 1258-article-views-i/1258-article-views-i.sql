# Write your MySQL query statement below
select distinct s.author_id id
from Views s
where author_id=viewer_id
order by s.author_id ASC;