import adapted_db.Authorization;
import adapted_db.DataBase;
import analitics.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization auth = new Authorization();
        if (auth.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
