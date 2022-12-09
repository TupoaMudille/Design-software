public class ProxyObjectAccess implements ObjectAccess {

    private String path;
    private String role;
    private SomeObjectAccess someObjectAccess;

    public ProxyObjectAccess(String path, String role) {
        this.path = path;
        this.role = role;
    }

    @Override
    public void access() {
        if (role == "admin") {
            if (someObjectAccess == null) {
                someObjectAccess = new SomeObjectAccess(path);
            }
            someObjectAccess.access();
        } else {
            System.out.println("You haven't access");
        }
    }
}
