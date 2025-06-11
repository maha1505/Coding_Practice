# Write your MySQL query statement below
SELECT email From Person group by email having count(*)>1;
