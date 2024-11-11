import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<User> friends;
    private ArrayList<String> posts;

    public User(String userName) {
        this.userName = userName;
        friends = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void addFriend(User user) {
        if(!friends.contains(user)) {
            friends.add(user);
        }
    }

    public void createPost(String content) {
        posts.add(content);
    }

    public void getPosts() {
        posts.forEach(System.out::println);
    }

    public void getFriends() {
        friends.forEach(System.out::println);
    }

    public String toString() {
        return this.userName;
    }
}
