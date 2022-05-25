
public class Main {

    public static void main(String[] args) {

        MessagingService ms = new MessagingService();
        System.out.println(ms.getMessages());
        Message m = new Message("sender", "message");
        ms.add(m);
    }
}
