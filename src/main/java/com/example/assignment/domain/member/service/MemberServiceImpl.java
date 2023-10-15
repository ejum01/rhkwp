package com.example.assignment.domain.member.service;

import com.example.assignment.domain.member.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepository memberRepository;

//    @Override
//    public int createMember(String username, String password) {
//        int result = 0;
//
//        if(username == null || password == null){
//            return 0;
//        }else {
//            result = memberRepository.createMember(username, password);
//        }
//
//        return result;
//    }
}
