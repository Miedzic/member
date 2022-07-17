package com.example.member.service;

import com.example.member.domain.dao.Member;
import com.example.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member save(Member member){
        return memberRepository.save(member);
    }
    public List<Member> getMembers(String familyName){
        return memberRepository.findByFamilyName(familyName);
    }
}
