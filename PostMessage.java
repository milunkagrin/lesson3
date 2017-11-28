package dom4;

public class PostMessage extends Message {
    Post post;

    PostMessage(Post p, int mes, String t, User a) {
        super(mes, t, a);

        post = p;

    }
    public Post getPost () {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;

    }
}

