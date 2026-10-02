# Write your MySQL query statement below
select d.name as department, e.name as employee , salary from employee e 
join department d 
on d.id=e.departmentid
where salary= (
    select Max(salary) from employee  ey
    where ey.departmentid=e.departmentid
);