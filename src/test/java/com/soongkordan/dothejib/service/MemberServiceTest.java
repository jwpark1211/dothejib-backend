package com.soongkordan.dothejib.service;

import com.soongkordan.dothejib.domain.Member;
import com.soongkordan.dothejib.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입_단일회원검색() {
        // given
        Member member = Member.createMember("test@google.com", "password");

        // when
        Long savedId = memberService.join(member);

        // then
        assertEquals(member, memberRepository.findOne(savedId));
    }

    @Test
    void 모든_회원_검색() {
        // given
        Member member1 = Member.createMember("test@google1.com", "password");
        memberService.join(member1);
        Member member2 = Member.createMember("test@google2.com", "password");
        memberService.join(member2);
        Member member3 = Member.createMember("test@google3.com", "password");
        memberService.join(member3);

        // when
        List<Member> members = memberService.findMembers();

        // then
        assertEquals(3, members.size());
    }
}