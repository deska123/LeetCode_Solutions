/* https://leetcode.com/problems/daily-leads-and-partners */

SELECT D.date_id, D.make_name,
(
    SELECT COUNT(DISTINCT D2.lead_id)
    FROM DailySales D2
    WHERE D2.date_id = D.date_id AND D2.make_name = D.make_name
) AS unique_leads,
(
    SELECT COUNT(DISTINCT D2.partner_id)
    FROM DailySales D2
    WHERE D2.date_id = D.date_id AND D2.make_name = D.make_name
) AS unique_partners
FROM DailySales D
GROUP BY D.date_id, D.make_name
