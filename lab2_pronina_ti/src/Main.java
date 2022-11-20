

public class Main {
    public static void main(String[] args) {
        SecurityPost sp = new SecurityPost();
        Camera cam1 = new Camera("Cam1");
        sp.Attach(cam1);
        Message msg = new Message("Cam1",  cam1.gerMadCamera()+"\n");
        sp.addMsg(msg);

        System.out.println("Add new cam2 to observe\n\n=============\n");
        Camera cam2 = new Camera("Cam2");
        sp.Attach(cam2);
        Message msg2 = new Message("Cam2",  cam2.gerMadCamera()+"\n");
        sp.addMsg(msg2);

    }
}