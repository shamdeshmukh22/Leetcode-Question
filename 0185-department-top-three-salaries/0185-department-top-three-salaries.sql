# Write your MySQL query statement below
select d.name as Department , e.name as Employee , Salary 
from employee e 
join department d
on d.id=e.departmentId
where salary in (
    select salary from (
        select  DISTINCT(salary) from employee ey
        where ey.departmentId=e.departmentId
        order by salary desc
        limit 3
    ) as employee 
);
