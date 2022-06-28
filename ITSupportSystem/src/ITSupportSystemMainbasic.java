import java.util.Queue;
import java.util.LinkedList;
public class ITSupportSystemMainbasic {
    public static void main(String[] args) throws Exception {

        String Person1 = "Warren"; 
        String Person2 = "Brandon";
        //Creating a queue for IT Support requests
        Queue<String> ITSupportRequest =  new LinkedList<>();

        //offer elements to the queue
        ITSupportRequest.offer(Person1);
        ITSupportRequest.offer(Person2);

        System.out.println("IT support Queue: " + ITSupportRequest);


    }
}
