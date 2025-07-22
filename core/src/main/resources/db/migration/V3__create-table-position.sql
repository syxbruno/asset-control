CREATE TABLE position (
    id INT PRIMARY KEY AUTO_INCREMENT,
    userId INT NOT NULL,
    assetsId INT NOT NULL,
    amout INT NOT NULL,
    midPrice INT NOT NULL,
    pl INT NOT NULL,

    FOREIGN KEY (userId) REFERENCES user(id),
    FOREIGN KEY (assetsId) REFERENCES assets(id)
);
