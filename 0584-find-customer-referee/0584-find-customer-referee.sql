# Write your MySQL query statement below
SELECT name
From Customer
WHERE referee_id != 2 OR referee_id is NULL;
-- WHERE COALESCE (referee_id,0) !=2; --COALESCE(referee_id, 0) --> COALESCE(referee_id, 0) → replaces NULL with 0

