-- Write your PostgreSQL query statement below

SELECT V.customer_id, count(customer_id) AS count_no_trans FROM 
Visits v LEFT JOIN Transactions t 
ON  v.visit_id=t.visit_id WHERE t.visit_id is NULL 
GROUP BY customer_id;
