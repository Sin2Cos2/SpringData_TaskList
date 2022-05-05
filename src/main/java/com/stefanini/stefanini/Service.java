package com.stefanini.stefanini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Service implements CommandLineRunner {

	@Autowired
	private	TaskManager taskManager;
	private static final int cut = 4;

	@Override
	public void run(String[] args) throws Exception {
		if(args.length == 0)
			return;

		// A switch case that is used to call the methods of the TaskManager class.
		switch (args[0]) {
			case "-createUser":
				taskManager.createUser(args[1].substring(cut), args[2].substring(cut), args[3].substring(cut));
				break;
			case "-showAllUsers":
				taskManager.showAllUsers();
				break;
			case "-addTask":
				taskManager.addTask(args[1].substring(cut), args[2].substring(cut), args[3].substring(cut));
				break;
			case "-showTasks":
				taskManager.showTasks(args[1].substring(cut));
				break;
			case "-addTaskToMany":
				taskManager.addTaskToMany(args[1].substring(cut), args[2].substring(cut), args[3].substring(cut));
			default:
		}
	}
}
