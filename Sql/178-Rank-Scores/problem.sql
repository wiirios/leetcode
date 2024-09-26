# Write your MySQL query statement below
SELECT Scores.score, DENSE_RANK() OVER (ORDER BY score DESC) AS `rank` FROM Scores