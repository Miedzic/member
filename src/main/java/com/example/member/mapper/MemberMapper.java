package com.example.member.mapper;

import com.example.member.domain.dao.Member;
import com.example.member.domain.dto.MemberDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    MemberDto memberToMemberDto(Member member);

    List<MemberDto> memberListToMemberListDto(List<Member> members);


    Member memberDtoToMember(MemberDto memberDto);
}
