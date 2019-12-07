package app.controller;

import app.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
/**
 * http://localhost:9090/user
 */

@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> btdf () {
        return Arrays.asList(
                new User("Jim"),
                new User("John"));
    }
}
