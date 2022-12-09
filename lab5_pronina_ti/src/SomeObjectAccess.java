public class SomeObjectAccess implements ObjectAccess{

    private String path;

    public SomeObjectAccess(String path){
        this.path=path;
        open();
    }

    public void open(){
        System.out.println("Open file: "+path);
    }

    @Override
    public void access() {
        System.out.println("Running file");

    }
}
