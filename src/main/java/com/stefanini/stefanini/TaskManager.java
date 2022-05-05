package com.stefanini.stefanini;

import com.stefanini.stefanini.model.Task;
import com.stefanini.stefanini.model.User;
import com.stefanini.stefanini.repository.TasksRepository;
import com.stefanini.stefanini.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskManager {

	@Autowired
	private TasksRepository tasksRepository;
	@Autowired
	private UserRepository userRepository;

	/**
	 * "Find the user with the given username, and if the user exists, print out the title and description of each of the
	 * user's tasks."
	 *
	 * @param userName The name of the user whose tasks we want to show.
	 */
	public void showTasks(String userName) {
		User user = userRepository.findByUserName(userName);
		if (user == null)
			return;
		for (Task task : user.getTasks()) {
			System.out.println(task.getTitle() + ": " + task.getDescription());
		}
	}

	/**
	 * If the user exists, save a new task with the given title and description.
	 *
	 * @param userName The username of the user who created the task.
	 * @param title The title of the task
	 * @param description The description of the task
	 */
	public void addTask(String userName, String title, String description) {
		User user = userRepository.findByUserName(userName);
		if (user == null)
			return;
		tasksRepository.save(new Task(0, title, description, user));
	}

	/**
	 * Show all users and the number of tasks they have.
	 */
	public void showAllUsers() {
		List<User> users = userRepository.findAll();
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + ", " + user.getTasks().size());
		}
	}

	/**
	 * If the user doesn't exist, create it.
	 *
	 * @param firstName The first name of the user
	 * @param lastName The last name of the user
	 * @param userName The username of the user to be created.
	 */
	public void createUser(String firstName, String lastName, String userName) {
		if (userRepository.findByUserName(userName) != null)
			return;
		userRepository.save(new User(0, firstName, lastName, userName));
	}

	/**
	 * For each username in the userNamesStr, find the user with that name, and if it exists, add a new task to that user.
	 *
	 * @param userNamesStr a string of usernames separated by commas and spaces.
	 * @param title The title of the task
	 * @param description The description of the task
	 */
	public void addTaskToMany(String userNamesStr, String title, String description) {
		String[] userNames = userNamesStr.split(", ");
		User user;
		for (String userName : userNames) {
			user = userRepository.findByUserName(userName);
			if(user == null)
				continue;
			tasksRepository.save(new Task(0, title, description, user));
		}
	}
}
