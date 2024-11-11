import java.util.ArrayList;

public class SocialNetwork {
    ArrayList<User> users;

    public SocialNetwork() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void showFriendsPosts(User user) {
        user.getPosts();
    }
}
