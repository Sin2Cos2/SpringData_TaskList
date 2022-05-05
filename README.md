# Stefanini Java Internship
## Rusu Dionisie
___
# Exercise 3
This part was implemented with Maven, SQL and Spring JPA. 
First step, program determinate functionality it has to execute. This part was implemented with a switch.

- createUser - Check if user with given username already is in database. Create new user and add in database if isn't.
- showAllUsers - Send request to database, get list with all users, iterate through array and print information about each user.
- addTask - Check if user with given username is in database. Add new task in table of tasks, if user was found.
- showTasks - Search for user in database with a query request, if returned object is not null, iterate through user's array and print information about each task.
- addTaskToMany - Possibility to add task to many users. Check for each received username in database. If user was found, add new task in database.