package blog.surapong.basicjava.accessibility.defineclass;

public class ExtendsUser extends User {


    public ExtendsUser(String publicValue, String protectedValue, String privateValue) {
        super(publicValue, protectedValue, privateValue);
    }

    public void printProtectedValue() {
        System.out.println("Protected Value : " + this.protectedValue );
    }
}
