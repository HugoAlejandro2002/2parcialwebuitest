package testSuiteTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoist.AddTaskSection;

import java.util.Date;

public class CreateTaskTest extends BaseTestTodoist {

    @Test
    public void createTaskSuccessfully() {
        String taskName = "Task " + new Date().getTime();

        mainPageTodoist.loginButton.click();
        loginPageTodoist.login("apazahuaychohugoalejandro@gmail.com", "Holasoyyo2002");

        menuSectionTodoist.addTaskButton.click();
        addTaskSection.addTask(taskName);

        Assertions.assertTrue(addTaskSection.taskNameTextBox.isControlDislayed(), "ERROR: La tarea no se añadió correctamente.");
    }
}
