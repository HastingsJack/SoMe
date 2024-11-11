//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        User bob = new User("Bob");
        User alice = new User("Alice");
        bob.addFriend(alice);
        alice.addFriend(bob);
        alice.getPosts();
        bob.getPosts();
        socialNetwork.addUser(alice);
        alice.addFriend(bob);
        alice.createPost("Hello");
        bob.addFriend(alice);
        Post one = new Post("Fish", "Bob");
        one.like();
        System.out.println(one);
        bob.getFriends();
    }
}