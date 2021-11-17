package user.sender;

import org.junit.jupiter.api.Test;
import user.adapted_user.AdaptedFacebookUser;
import user.adapted_user.AdaptedTwitterUser;

import java.time.Duration;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    @Test
    void send() {
        String country = "Azerbaijan";
        AdaptedFacebookUser userF = new AdaptedFacebookUser("fb@gmail.com", country,
                                                            new Date(System.currentTimeMillis() - 3_600_000 + 2000));
        assertTrue (MessageSender.send("mama ya v shaptsi!", userF, country));
        assertFalse(MessageSender.send("mama ya v shaptsi!", userF, "papa"));

        AdaptedTwitterUser userT = new AdaptedTwitterUser("fb@gmail.com", country,
                                                          new Date(System.currentTimeMillis() - 3_600_000));
        assertFalse(MessageSender.send("mama ya v shaptsi!", userT, country));
        assertFalse(MessageSender.send("mama ya v shaptsi!", userT, "zizi"));
    }
}