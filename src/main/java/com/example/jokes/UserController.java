package com.example.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")

    public String getUsers (ModelMap modelMap){
        RegularUser user = new RegularUser("adam", "kowlaski");
        RegularUser user2 = new RegularUser("adam2", "kowalski");

        Admin admin = new Admin("admin", "test23");
        Admin admin2 = new Admin("admin3", "test2ww3");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        modelMap.put("users",users);
        return "users";
    }
}
