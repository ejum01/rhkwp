package com.example.assignment.domain.member.repository;

import com.example.assignment.config.auth.PrincipalDetails;
import com.example.assignment.domain.member.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberRepository {



    PrincipalDetails loadUserByUsername(String username);

    @Insert("insert into member (id, username, password) values (seq_member_id.nextval, #{username}, #{password})")
    int insertMember(Member memberInfo);
}
