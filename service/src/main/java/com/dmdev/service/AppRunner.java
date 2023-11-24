package com.dmdev.service;

import com.dmdev.service.service.UserService;

public class AppRunner {

    public static void main(String[] args) {

        UserService service = new UserService();
        System.out.println(service.getuser(25L));
    }
}
