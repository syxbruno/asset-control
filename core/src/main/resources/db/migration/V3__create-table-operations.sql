CREATE TABLE operations (
    id INT PRIMARY KEY AUTO_INCREMENT,
    userId INT NOT NULL,
    assetsId INT NOT NULL,
    amount INT NOT NULL,
    unitPrice INT NOT NULL,
    operationType ENUM('buy','sale') NOT NULL,
    brokerage INT NOT NULL,
    operationDate DATETIME NOT NULL,

    FOREIGN KEY (userId) REFERENCES user(id),
    FOREIGN KEY (assetsId) REFERENCES assets(id)
);
