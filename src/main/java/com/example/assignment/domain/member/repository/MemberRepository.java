package com.example.assignment.domain.member.repository;

import com.example.assignment.config.auth.PrincipalDetails;
import com.example.assignment.domain.member.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberRepository {



    PrincipalDetails loadUserByUsername(String username);

    @Insert("insert into member (id, username, password) values (seq_member_id.nextval, #{username}, #{password})")
    int insertMember(Member memberInfo);
    @Insert("insert into member (id, username, password) values (seq_member_id.nextval, #{username}, #{password})")
    int createMember(String username, String password);

    @Select("select * from member where username = {username}")
    int selectMember(String username, String password);
}
