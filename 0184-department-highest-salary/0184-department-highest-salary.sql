# Write your MySQL query statement below
select e.name as Employee, d.name as Department , salary as Salary
from Employee e 
inner join Department d on e.departmentId = d.id
where e.salary  = (
    select max(salary)
    from employee 
    where departmentId = d.id
    );
