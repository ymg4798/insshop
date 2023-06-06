DROP TABLE IF EXISTS product;

CREATE TABLE product
(
    id     BIGINT       NOT NULL AUTO_INCREMENT,
    name   VARCHAR(255)      NOT NULL,
    price  BIGINT        NOT NULL,
    PRIMARY KEY (id)
);