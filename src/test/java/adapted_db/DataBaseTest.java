package adapted_db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    static DataBase db;

    @BeforeEach
    void setUp() {
        db = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals("hello", db.getUserData());
    }

    @Test
    void getStatisticsData() {
        assertEquals("hello2", db.getStatisticsData());
    }
}