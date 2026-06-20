# Write your MySQL query statement below
-- select B.id from weather A
--     join weather B 
--     on A.recordDate = DATE_SUB(B.recordDate, INTERVAL 1 DAY)
--     where B.temperature > A.temperature;

SELECT id
FROM weather w1
WHERE temperature > (
    SELECT temperature
    FROM weather w2
    WHERE w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
);