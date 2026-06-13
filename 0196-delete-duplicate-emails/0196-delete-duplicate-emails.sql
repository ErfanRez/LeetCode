WITH 
email_stats AS (
    SELECT Email,
           COUNT(Email) as count,
           MIN(id) as min_id
    FROM Person
    GROUP BY Email
    HAVING COUNT(Email) >= 2
)
DELETE FROM Person
WHERE email IN (SELECT email FROM email_stats)
  AND id NOT IN (SELECT min_id FROM email_stats);