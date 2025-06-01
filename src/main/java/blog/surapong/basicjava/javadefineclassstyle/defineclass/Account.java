package blog.surapong.basicjava.javadefineclassstyle.defineclass;

public class Account {

    private String accountName;
    private double value;

    private int countGetValue = 0;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getValue() {

        if (this.countGetValue >= 3) {
            throw new IllegalStateException("Cannot get value more than 3 time");
        }
        this.countGetValue++;
        return value;
    }

    public void setValue(double value) {

        if (value < 0) {
            throw new IllegalArgumentException("value below 0");
        }

        this.value = value;
    }
}
