import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> taskList;

    public TodoList() {
        this.taskList = new ArrayList<>();
    }

    public void add(String task) {
        this.taskList.add(task);
    }

    public void print() {
        int index = 1;
        for (String e : this.taskList) {
            System.out.println(index + ": " + e);
            index++;
        }
    }

    public void remove(int number) {
        this.taskList.remove(number - 1);
    }
}
