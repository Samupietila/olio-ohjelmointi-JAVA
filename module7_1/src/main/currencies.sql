DROP DATABASE IF EXISTS currencies;
CREATE DATABASE currencies;
USE currencies;
CREATE TABLE currencies (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            code VARCHAR(3) NOT NULL,
                            symbol VARCHAR(3) NOT NULL,
                            rate FLOAT NOT NULL DEFAULT 1
);
INSERT INTO currencies (name, code, symbol, rate) VALUES
                                                      ('US Dollar', 'USD', '$','1'),
                                                      ('Euro', 'EUR', '€','0.93'),
                                                      ('British Pound', 'GBP', '£','0.8'),
                                                      ('Japanese Yen', 'JPY', '¥','153.06'),
                                                      ('Australian Dollar', 'AUD', '$','1.51'),
                                                      ('Canadian Dollar', 'CAD', '$','1.37'),
                                                      ('Swiss Franc', 'CHF', 'Fr','1.01'),
                                                      ('Chinese Yuan Renminbi', 'CNY', '¥','6.92'),
                                                      ('Swedish Krona', 'SEK', 'kr','8.55'),
                                                      ('New Zealand Dollar', 'NZD', '$','1.66');
