DELIMITER $$

CREATE PROCEDURE sp_cast_vote (
    IN voter_name VARCHAR(100),
    IN item_id INT
)
BEGIN
    INSERT INTO vote_record (voter_name, vote_item_id)
    VALUES (voter_name, item_id);
END$$

DELIMITER ;
