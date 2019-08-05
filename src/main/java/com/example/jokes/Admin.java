package com.example.jokes;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    private List<String> roles = new ArrayList<>();

    public Admin(String name, String password){
        super(name,password);
    }

}
