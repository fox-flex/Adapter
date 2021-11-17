package user.adapted_user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedTwitterUserTest {
    static AdaptedTwitterUser user;
    @BeforeEach
    void setUp() {
        user = new AdaptedTwitterUser("nice.email@chilling.com", "Azerbaijan",new Date());
    }

    @Test
    void getEmail() {
        assertEquals(user.getEmail(), "nice.email@chilling.com");
    }

    @Test
    void getCountry() {
        assertEquals(user.getCountry(), "Azerbaijan");
    }

    @Test
    void getTime() {
        assertNotNull(user.getTime());
    }
}