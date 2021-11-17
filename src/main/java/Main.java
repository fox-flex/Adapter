import db.Authorisation;
import db.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorisation autorisation = new Authorisation();
        if (autorisation.authorisation(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
