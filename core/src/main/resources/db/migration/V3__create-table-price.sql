CREATE TABLE price (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    assetsId INT NOT NULL,
    unitPrice DECIMAL(10,2) NOT NULL,
    priceDate DATETIME NOT NULL,

    FOREIGN KEY (assetsId) REFERENCES assets(id)
);
