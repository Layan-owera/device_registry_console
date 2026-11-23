SELECT * FROM devices;


 SELECT
       e.event_id,
       e.device_code,
       e.event_type,
       e.event_timestamp,
       d.device_name
   FROM device_events e
            JOIN devices d

                 ON e.device_code = d.device_code
   ORDER BY e.event_timestamp DESC;
 SELECT
       d.device_code,
       d.device_name,
       COUNT(e.event_id) AS total_events
   FROM devices d
            LEFT JOIN device_events e
                      ON d.device_code = e.device_code
   GROUP BY d.device_code, d.device_name;





 SELECT * FROM device_events
   WHERE event_timestamp BETWEEN '2026-11-21 10:00:00'
             AND '2026-11-21 11:00:00';


