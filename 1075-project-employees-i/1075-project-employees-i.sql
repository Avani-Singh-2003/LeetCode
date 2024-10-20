# Write your MySQL query statement below
Select p.project_id, ROUND(AVG(e.experience_years), 2) AS average_years
from Project p
Join Employee e
on p.employee_id = e.employee_id
group by p.project_id; 