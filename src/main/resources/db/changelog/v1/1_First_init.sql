CREATE TABLE `ru-aronbergman`.`users`
(
    `id`       BIGINT(20) NOT NULL,
    `email`    VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
);
