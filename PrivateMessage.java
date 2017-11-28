package dom4;



public class PrivateMessage extends Message {
    User user;

    PrivateMessage(User u, int mes, String t, User a) {
        super(mes, t, a);
        user = u;
    }
    public User getUser () {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;

    }
}
