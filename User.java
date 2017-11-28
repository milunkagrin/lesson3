package dom4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class User {
    int userld;
    String name;
    String lastName;
    String email;
    Date registratinDate;
        User ( String n, String ln, String e) {
            name = n;
            lastName = ln;
            email = e;
            Calendar c = new GregorianCalendar();
            registratinDate = c.getTime();
        }


}
