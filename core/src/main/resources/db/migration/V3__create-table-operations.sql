CREATE TABLE operations (
    id INT PRIMARY KEY AUTO_INCREMENT,
    userId INT NOT NULL,
    assetsId INT NOT NULL,
    amount INT NOT NULL,
    unitPrice DECIMAL(10,2) NOT NULL,
    operationType ENUM('buy','sale') NOT NULL,
    brokerage DECIMAL(10,2) NOT NULL,
    operationDate DATETIME NOT NULL,

    FOREIGN KEY (userId) REFERENCES user(id),
    FOREIGN KEY (assetsId) REFERENCES assets(id)
);
