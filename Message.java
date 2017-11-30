package dom4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    int messageld;
    String text;
    User author;
    Date date;

        public Message ( int mes, String t, User a) {
            messageld = mes;
            this.text = t;
            author = a;
            Calendar c2 = new GregorianCalendar();
            date = c2.getTime();

        }
}
