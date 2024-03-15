package app.view;

import app.filter.UserFilter;
import app.model.User;

import java.util.ArrayList;
import java.util.List;

public class ProgramView {

        public void listUsers()  {
            List<User> users = new ArrayList<>();
            users.add(new User("Alice", "Al123@gmail.com"));
            users.add(new User("Bob", "bob@gmail.com"));
            users.add(new User("Charlie", "charlie456@gmail.com"));
            users.add(new User("David", "david789@gmail.com"));
            users.add(new User("Eve", "Ev123@gmail.com"));


            UserFilter userFilter = new UserFilter();
            List<User> filteredUsers = userFilter.filterUsers(users);

            output(filteredUsers);

        }

        public void output(List<User> users) {
        System.out.println("Filtered Users:");
        users.forEach(System.out::println);


        }
    }



