# Write your MySQL query statement below
Select e.name,eui.unique_id From Employees e Left Join EmployeeUNI eui ON e.id = eui.id