package my.app.repository;

import my.app.authorities.Authorities;
import my.app.user.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    //test data initialization
    private final List<User> userList = new ArrayList<>(List.of(
            new User("Ivan", "qwerty", new ArrayList<>(
                    Arrays.asList(Authorities.DELETE, Authorities.READ, Authorities.WRITE))),
            new User("Sergey", "zxcvbn", new ArrayList<>(
                    List.of(Authorities.READ)))));

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (User user1 : userList) {
            if (user1.getUser().equals(user) && user1.getPassword().equals(password)) {
                return user1.getAuthorities();
            }
        }
        return new ArrayList<>();
    }
}
