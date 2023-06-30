/* https://leetcode.com/problems/find-total-time-spent-by-each-employee */

SELECT E.event_day AS day, E.emp_id, 
total_time = (
  SELECT SUM(E2.out_time - E2.in_time)
  FROM Employees E2
  WHERE E2.event_day = E.event_day AND E2.emp_id = E.emp_id
)
FROM Employees E
GROUP BY E.emp_id, E.event_day
ORDER BY E.emp_id ASC, E.event_day ASC
