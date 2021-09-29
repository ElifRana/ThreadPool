import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {

        //tüm görevleri yürütmek için 2 pool oluşturduk
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        //8 görev oluşturur ve yürütücü kuyruğa gönderir.
        for (int i = 1; i <= 8; i++) {
            Task task = new Task("Task: " + i);
            System.out.println("Creating: " + task.getName());

            executor.execute(task);
        }
        executor.shutdown();
    }
}
