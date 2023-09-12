public class User {
    private String name;
    private String sexuality;

    public User(String name, String sexuality) {
        this.name = name;
        this.sexuality = sexuality;
    }

    public String getName() {
        return name;
    }

    public String getSexuality() {
        return sexuality;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Create some sample users
        users.add(new User("Alice", "Heterosexual"));
        users.add(new User("Bob", "Heterosexual"));
        users.add(new User("Charlie", "Homosexual"));
        users.add(new User("David", "Bisexual"));
        users.add(new User("Eve", "Heterosexual"));

        // Get the user's sexuality preference
        System.out.println("Welcome to the Dating App!");
        System.out.print("Enter your sexuality (Heterosexual, Homosexual, Bisexual): ");
        String userSexuality = scanner.nextLine();

        // Display potential matches based on sexuality filter
        System.out.println("Potential Matches:");
        for (User user : users) {
            if (user.getSexuality().equals(userSexuality)) {
                System.out.println("- " + user.getName());
            }
        }

        System.out.println("Thank you for using the Dating App!");
    }
}
