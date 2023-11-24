package com.example.assignment.domain.member.service;

public interface MemberService {
    int createMember(String username, String password);

    int selectmember(String username, String password);

//    int createMember(String username, String password);
}
