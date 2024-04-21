package com.softman.friendshipservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FriendController {

    //hello world right controller method with getmapping
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
