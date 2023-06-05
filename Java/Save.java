package Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

public class Save {
    public void saveResult(Queue<Toy> queue){
        try (FileWriter writer = new FileWriter("Result.txt", false)) {
            while (!queue.isEmpty()) {
                writer.append(String.format("%s  ", queue.peek()));
                writer.append("\n");
                queue.poll();
            writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
