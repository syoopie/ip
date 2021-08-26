import java.io.FileWriter;
import java.io.IOException;

public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns a status icon.
     *
     * @return X if task is done, an empty space if it is not
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Marks a task as done.
     */
    public boolean markAsDone() {
        isDone = !isDone;
        return isDone;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + description;
    }



    public abstract void writeToFile(FileWriter myWriter) throws IOException;

}
