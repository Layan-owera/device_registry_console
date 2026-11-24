# Project Documentation

## 1. Design Decisions

Design Decision 1: Separate Devices and Device Events

I used two separate tables instead of storing event information directly in the devices table. This allows each device to have multiple events without repeating device information.

Design Decision 2: Use a Foreign Key

I used device_id as a foreign key in the device_events table to ensure that every event belongs to an existing device. This maintains referential integrity and prevents events from referencing nonexistent devices.
## 2. Peer Review

- **Reviewed Schema (Whose Schema):** Eman.
- **Suggested Improvement:** Change the `event_timestamp` data type from `VARCHAR(50)` to `DATETIME`.

## 3. Actual Hours Worked

Total Actual Hours: 17 hours.