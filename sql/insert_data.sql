INSERT INTO devices (device_code, device_name)
VALUES
    ('RFID-001', 'Main Gate Reader'),
    ('IO-001', 'Gate IO Controller'),
    ('CAM-001', 'Entry Camera');

INSERT INTO device_events (device_code, event_timestamp, event_type)
VALUES
    ('RFID-001', '2026-11-21 10:00:00', 'ACCESS'),
    ('RFID-001', '2026-11-21 10:30:00', 'EXIT'),
    ('IO-001', '2026-11-21 11:00:00', 'SIGNAL');
