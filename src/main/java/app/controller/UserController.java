package app.controller;

import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
/**
 * http://localhost:9090/users
 */
@RestController
public class UserController {

    private final UserService service;

    public UserController(@Autowired UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public Collection<User> get_All () {
        return service.getAll();
    }
    @GetMapping("/user")      // "/user?id=1"
    public User get_one (@RequestParam("id") int id__) {
        return service.getOne(id__);
    }
    @GetMapping("/user/{id}")      // "/user/1"
    public User get_one2 (@PathVariable("id") int id__) {
        return service.getOne(id__);
    }

}
