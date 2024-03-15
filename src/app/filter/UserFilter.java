package app.filter;

import app.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserFilter {
    public List<User> filterUsers(List<User> users) {
        return users.stream()
                .filter(user -> user.getEmail().contains("123"))
                .collect(Collectors.toList());
    }
}





