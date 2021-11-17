package user.adapted_user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.facebook.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedFacebookUserTest {
    static AdaptedFacebookUser user;

    @BeforeEach
    void setUp() {
        user = new AdaptedFacebookUser("nice.email@chilling.com", "Azerbaijan",new Date());
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