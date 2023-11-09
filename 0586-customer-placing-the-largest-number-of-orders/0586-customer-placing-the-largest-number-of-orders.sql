# Write your MySQL query statement below
SELECT customer_number 
FROM Orders
GROUP BY customer_number
HAVING COUNT(*) IN
(SELECT max(i.cnt)
FROM
(SELECT customer_number,COUNT(*) as 'cnt'
FROM Orders 
GROUP BY customer_number
HAVING COUNT(*)>1) AS i) 