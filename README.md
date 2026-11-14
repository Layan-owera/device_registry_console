--Device Registry Console is a program that allows users to manage devices.

--In this application, users can:

-Add a device.

-Search for a device.

-Show all devices.

-Exit the application.

--Technologies Used

Java 21

Apache Maven

Git and GitHub

--Manual Testing Results

** Add Device
1. Added a device with valid information.
Result: Device added successfully!

2. Entered an empty device ID.
Result: Please enter the ID correctly. The field is empty.

3. Entered an unsupported device type.
Result: The type should only be (RFID, IO, CAMERA). Please enter the type correctly.

4. Tried to add a device with an existing ID.
Result: This ID is already exists.

5. Tried to add a duplicate ID using different letter cases.
Result: This ID is already exists.
** Show All Devices
1. Displayed all registered devices.
Result: All devices were displayed correctly.

2. Displayed the device list when it was empty.
Result: There is no device in the list.
** Search for a Device
1. Searched for an existing device.
Result: The device details were displayed.

2. Searched for a device that does not exist.
Result: No device found.

3. Searched using an ID with different letter cases.
Result: The matching device was displayed.

4. Searched when the device list was empty.
Result: There is no device in the list.
**Menu and Input Handling
1. Entered an invalid menu option (9).
Result: Please Enter valid option.

2. Entered text instead of a number (hello).
Result: Invalid input! Please enter a number.

3. Selected the Exit option (4).
Result: You choose exit option.

Test Results: All tests passed successfully.

--Setup Instructions

Install Java JDK 21, Maven, and Git .

Clone the repository:

git clone https://github.com/Layan-owera/device_registry_console.git

Open the project in IntelliJ IDEA.

Build the project:

mvn clean package

Run the Main class to start the application

Actual Result: The application displays "There is no device in the list".

Status: PASS
