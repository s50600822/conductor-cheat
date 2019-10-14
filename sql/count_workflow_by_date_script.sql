DROP PROCEDURE IF EXISTS count_workflow_by_date;
DELIMITER // 
CREATE PROCEDURE count_workflow_by_date
()
BEGIN
  select DATE_FORMAT(created_on, '%Y/%m/%d') day, count(workflow_id) workflowCount from workflow group by DATE_FORMAT(created_on, '%Y/%m/%d');
END //
DELIMITER ;