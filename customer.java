import java.util.Scanner;
public class customer {
    private String customerName;
    private String customerEmail;
    public customer() {
    }
    public customer(String cname, String cemail) {
        customerName = cname;
        customerEmail = cemail;
    }
    public void display() {
        System.out.println("Details are " + customerName + " " + customerEmail);
    }
    public void getname() {
Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        customerName = kboard.nextLine();
    }
    public void getemail() {
Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        customerEmail = kboard.nextLine();
    }
}