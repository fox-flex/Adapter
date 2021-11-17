package adapted_db;

import db.Авторизація;

public class Authorization {
    private final Авторизація authorization;

    public Authorization() {
        this.authorization = new Авторизація();
    }

    public boolean authorize(DataBase db) {
        return this.authorization.авторизуватися(db.getDb());
    }
}
