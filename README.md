# Stefanini Java Internship
## Rusu Dionisie
___
# Exercise 3
This part was implemented with Maven, SQL and Spring JPA. 
First step, program determinate functionality it has to execute. This part was implemented with a switch.

1. Create new users - by running this command:
java -jar stefanini.jar -createUser -fn='FirstName' - ln='LastName' -un='UserName'

2. Show All Users - by running this command:
java -jar stefanini.jar -showAllUsers

3. Add a task to the user - by running this command:
java -jar stefanini.jar -addTask -un='userName' -tt='Task Title' -td='Task Description'

4. Show user's tasks - by running this command:
java -jar stefanini.jar -showTasks -un='userName'

5. Add task to many users - by running this command:
java -jar stefanini.jar -addTaskToMany -uns='username1, username2' -tt='Task Title' -td='Task Description'

- createUser - Check if user with given username already is in database. Create new user and add in database if isn't.
- showAllUsers - Send request to database, get list with all users, iterate through array and print information about each user.
- addTask - Check if user with given username is in database. Add new task in table of tasks, if user was found.
- showTasks - Search for user in database with a query request, if returned object is not null, iterate through user's array and print information about each task.
- addTaskToMany - Possibility to add task to many users. Check for each received username in database. If user was found, add new task in database.


