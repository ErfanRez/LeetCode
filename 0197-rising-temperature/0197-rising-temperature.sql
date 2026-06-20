# Write your MySQL query statement below
select B.id from weather A
    join weather B 
    on A.recordDate = DATE_SUB(B.recordDate, INTERVAL 1 DAY)
    where B.temperature > A.temperature;