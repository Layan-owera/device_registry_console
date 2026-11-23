
START TRANSACTION;

INSERT INTO devices (device_code, device_name)
VALUES ('D1', 'Device 1');

INSERT INTO device_events (device_code, event_timestamp, event_type)
VALUES ('D1', '2026-11-21 14:00:00', 'Event 1');

COMMIT;

SELECT * FROM devices
WHERE device_code = 'D1';

SELECT * FROM device_events
WHERE device_code = 'D1';





START TRANSACTION;

INSERT INTO devices (device_code, device_name)
VALUES ('D2', 'Device 2');

INSERT INTO device_events (device_code, event_timestamp, event_type)
VALUES ('D2', '2026-11-21 14:30:00', 'Event 1');

ROLLBACK;


SELECT * FROM devices
WHERE device_code = 'D2';

SELECT * FROM device_events
WHERE device_code = 'D2';
