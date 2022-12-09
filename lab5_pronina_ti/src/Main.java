public class Main {
    public static void main(String[] args) {
        ObjectAccess objectAccess = new ProxyObjectAccess("C:/Users/tanap/Documents/Работы/ууу.txt","admin");
        //ObjectAccess objectAccess = new ProxyObjectAccess("C:/Users/tanap/Documents/Работы/ууу.txt","NOadmin");
        objectAccess.access();
    }
}