package snippet;

public class Snippet {
	LocalDate date1 = LocalDate.ofEpochDay(2024 - 03 - 03);
	Task test1 = new Task("name", "des", date1, Priority.HIGH, true);
	Task test2 = new Task("name", "des", date1, Priority.LOW, false);
	Task test3 = new Task("name", "des", date1, Priority.HIGH, true);
	todo.addTask(test1);
	todo.addTask(test2);
	todo.addTask(test3);
}

