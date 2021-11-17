package adapted_db;

import db.БазаДаних;
import lombok.Getter;

@Getter
public class DataBase {
    private final БазаДаних db;

    public DataBase() {
        this.db = new БазаДаних();
    }

    public String  getUserData() {
        return this.db.отриматиДаніКористувача();
    }

    public String  getStatisticsData() {
        return this.db.отриматиСтатистичніДані();
    }
}
