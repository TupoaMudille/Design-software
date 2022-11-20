import java.util.ArrayList;

public class SecurityPost implements Subject{
    protected ArrayList<Message> allMsg;
    protected ArrayList<Observer> observers;
    public SecurityPost(){
        allMsg = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addMsg(Message msg){
        allMsg.add(msg);
        Notify();
    }

    public void seeMsg(){
        Notify();
    }

    public ArrayList<Message> getState(){
        return allMsg;
    }

    public void Attach(Observer o){
        observers.add(o);
    }
    public void Dettach(Observer o){
        observers.remove(o);
    }
    public void Notify(){
        for (int i=0;i<observers.size();i++){
            observers.get(i).update(this);
        }
    }
}
