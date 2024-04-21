package com.softman.friendshipservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Friend {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String company;
    private String job;
}
