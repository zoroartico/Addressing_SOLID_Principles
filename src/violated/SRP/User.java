package violated.SRP;
import lombok.Data;

@Data
public class User {
    private String name;
    private String email;

    //construct user
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //save user data
    public void saveUser() {
        System.out.println("User data saved: " + name + ", " + email);
    }

    //send notification email
    public void sendNotificationEmail(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}

