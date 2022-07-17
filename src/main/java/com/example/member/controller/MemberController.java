package com.example.member.controller;

import com.example.member.domain.dao.Member;
import com.example.member.domain.dto.MemberDto;
import com.example.member.mapper.MemberMapper;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper memberMapper;

    @GetMapping("/{familyName}")
    public List<MemberDto> getMembers(@PathVariable String familyName){
        return memberMapper.memberListToMemberListDto(memberService.getMembers(familyName));
    }
    @PostMapping
    public MemberDto createFamilyMember(@RequestBody MemberDto memberDto){
        return memberMapper.memberToMemberDto(memberService.save(memberMapper.memberDtoToMember(memberDto)));
    }
}
