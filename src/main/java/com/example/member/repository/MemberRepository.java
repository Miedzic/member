package com.example.member.repository;

import com.example.member.domain.dao.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    List<Member> findByFamilyName(String familyName);
}
