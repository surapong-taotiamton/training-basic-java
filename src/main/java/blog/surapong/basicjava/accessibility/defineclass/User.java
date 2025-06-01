package blog.surapong.basicjava.accessibility.defineclass;

public class User {

    public String publicValue;

    protected String protectedValue;

    private String privateValue;

    public User() {}

    public User(String publicValue, String protectedValue, String privateValue) {
        this.publicValue = publicValue;
        this.protectedValue = protectedValue;
        this.privateValue = privateValue;
    }

    public void printPrivateValue() {
        System.out.println("Private value : " + privateValue);
    }
}
