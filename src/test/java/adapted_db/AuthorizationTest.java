package adapted_db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    static Authorization auth;

    @BeforeEach
    void setUp() {
        auth = new Authorization();
    }

    @Test
    void authorize() {
        assertTrue(auth.authorize(new DataBase()));
    }
}