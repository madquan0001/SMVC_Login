package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users;

    static {
        users = new ArrayList<>();
        User ul = new User();
        ul.setAccount("legendh3r0");
        ul.setPassword("haydoiday");
        ul.setName("Quân");
        ul.setEmail("quan199877@gmail.com");
        ul.setAge(21);
        users.add(ul);

        User u2 = new User();
        ul.setAccount("madquan0001");
        ul.setPassword("lucifer1998");
        ul.setName("Quân 2");
        ul.setEmail("madquan0001@gmail.com");
        ul.setAge(20);
        users.add(u2);

        User u3 = new User();
        ul.setAccount("madquan0002");
        ul.setPassword("lucifer1998");
        ul.setName("Quân 3");
        ul.setEmail("madquan0002@gmail.com");
        ul.setAge(20);
        users.add(u3);

        User u4 = new User();
        ul.setAccount("madquan0003");
        ul.setPassword("lucifer1998");
        ul.setName("Quân 4");
        ul.setEmail("madquan0003@gmail.com");
        ul.setAge(24);
        users.add(u4);
    }

    public static User checkLogin(Login login){
        for (User u : users)
        {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword()))
            {
                return u;
            }
        }
        return null;
    }


}
