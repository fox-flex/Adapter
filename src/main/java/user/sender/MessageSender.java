package user.sender;

import lombok.Setter;
import user.adapted_user.User;

import java.util.Date;
import java.util.Objects;

@Setter
public class MessageSender {
    private static boolean VERBOSE = true;
    public static boolean send(String text, User user, String country) {
        if (!Objects.equals(user.getCountry(), country)) {
            if (VERBOSE)
                System.out.println("Wrong country of destination!");
            return false;
        } else if (user.getTime() == null) {
            if (VERBOSE)
                System.out.println("Cannot determinate last activity time of user!");
            return false;
        }
        Date now = new Date();
        if (now.getTime() - user.getTime().getTime() >= 3_600_000) {
            if (VERBOSE)
                System.out.println("Last seen more, than 1 hour ago!");
            return false;
        }

        System.out.printf("User (%s) get message : %s", user.getEmail(), text);

        if (VERBOSE)
            System.out.println("Message successfully sent!");
        return true;
    }
}
