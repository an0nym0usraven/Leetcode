# Write your MySQL query statement below
SELECT
    e2.employee_id,
    e2.name,
    COUNT(*) AS reports_count,
    ROUND(AVG(e1.age),0) AS average_age
FROM 
    employees AS e1 INNER JOIN employees AS e2
    ON e1.reports_to = e2.employee_id
GROUP BY 
    e1.reports_to
ORDER BY
    e2.employee_id;