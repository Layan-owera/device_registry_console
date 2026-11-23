CREATE DATABASE device_registry;

USE device_registry;
CREATE TABLE devices (
                         device_code VARCHAR(50) PRIMARY KEY,
                         device_name VARCHAR(100) NOT NULL
);

CREATE TABLE device_events (
                               event_id INT AUTO_INCREMENT PRIMARY KEY,
                               device_code VARCHAR(50) NOT NULL,
                               event_timestamp TIMESTAMP NOT NULL,
                               event_type VARCHAR(50) NOT NULL,
                               FOREIGN KEY (device_code)
                                   REFERENCES devices(device_code)
);
