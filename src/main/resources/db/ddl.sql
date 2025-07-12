CREATE TABLE vote_item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE vote_record (
    id INT AUTO_INCREMENT PRIMARY KEY,
    voter_name VARCHAR(100) NOT NULL,
    vote_item_id INT NOT NULL,
    vote_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (vote_item_id) REFERENCES vote_item(id)
);
