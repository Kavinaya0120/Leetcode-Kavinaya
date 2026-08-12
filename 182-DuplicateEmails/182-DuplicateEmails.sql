-- Last updated: 8/12/2026, 11:41:17 PM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;