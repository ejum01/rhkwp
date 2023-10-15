package com.example.assignment.config.auth;

import com.example.assignment.domain.member.entity.Member;
import com.example.assignment.domain.member.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        PrincipalDetails principalDetails = memberRepository.loadUserByUsername(username);
        return principalDetails;
    }
    public int insertMember(Member memberInfo) {
        return memberRepository.insertMember(memberInfo);
    }

}
