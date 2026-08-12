-- Last updated: 8/12/2026, 11:41:26 PM
# Write your MySQL query statement below
SELECT score,
       DENSE_RANK() OVER (
           ORDER BY score DESC
       ) AS `rank`
FROM Scores
ORDER BY score DESC;