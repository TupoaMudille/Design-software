import java.util.ArrayList;
import java.util.Random;
public class Camera implements Observer {
    String name;
    String status = "status: ";
    String coordinates = "on coordinates: ";
    int[][] a = new int[10][10];
    private void outputCamera(String name){
        System.out.println(name+"\n");
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("----------------------\n");
    }
    public Camera(String name){
        this.name = name;

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                a[i][j] = 0;
            }
        }
        outputCamera(name);
    }

    public String gerMadCamera(){
        Random random = new Random();
        int count = 0;
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                a[i][j] = random.nextInt(2);
                if (a[i][j]==1){
                    count++;
                    coordinates+="("+(i+1)+","+(j+1)+")";
                }
            }
        }
        outputCamera(name);
        System.out.print("\n");
        if (count>=2){
            status+="movement noticed";
            return "\ncount movements: "+count+" "+coordinates+"\n"+status;
        }
        status+="alright";
        return status;
    }
    public void checkMsg(ArrayList<Message> msg){
        for (int i=0; i<msg.size();i++){
            if (name.compareTo(msg.get(i).receiverName)==0)
                System.out.println(name+": "+msg.get(i).content);
        }
        System.out.println("-------------------------\n");
    }
    public void update(Object obj){
        if(obj instanceof  SecurityPost){
            SecurityPost sp = (SecurityPost) obj;
            checkMsg(sp.getState());
        }
    }
}