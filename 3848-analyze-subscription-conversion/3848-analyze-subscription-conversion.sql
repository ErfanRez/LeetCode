# Write your MySQL query statement below
WITH paid_users AS (
    SELECT DISTINCT user_id
    FROM UserActivity
    WHERE activity_type = 'paid'
)

SELECT
    u.user_id,
    ROUND(AVG(CASE WHEN u.activity_type = 'free_trial' THEN u.activity_duration END), 2) AS trial_avg_duration,
    ROUND(AVG(CASE WHEN u.activity_type = 'paid' THEN u.activity_duration END), 2) AS paid_avg_duration
FROM
    UserActivity u
JOIN
    paid_users p ON u.user_id = p.user_id
GROUP BY
    u.user_id
ORDER BY
    u.user_id;