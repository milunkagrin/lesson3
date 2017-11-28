package dom4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Post {
    int postld;
    String title;
    Date postedAt;
        Post ( int pld, String t ) {
            postld = pld;
            title = t;
            Calendar c1 = new GregorianCalendar();
            postedAt = c1.getTime();

        }

}
