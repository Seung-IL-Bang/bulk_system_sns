package com.example.fastcampusmysql.domain.service;

import com.example.fastcampusmysql.domain.dto.MemberRegisterCommand;
import com.example.fastcampusmysql.domain.entity.Member;
import com.example.fastcampusmysql.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberWriteService {

    final private MemberRepository memberRepository;

    public Member create(MemberRegisterCommand command) {
        /**
         *  목표
         *      - 회원정보(이메일, 닉네임, 생년월일)을 등록한다.
         *      - 닉네임은 10자를 넘길 수 없다.
         *  파라미터
         *      - memberRegisterCommand
         *
         *  val member = Member.of(memberRegisterCommand)
         *  memberRepository.save(member)
         */

        var member = Member.builder()
                .nickname(command.nickname())
                .email(command.email())
                .birthDay(command.birthDay())
                .build();

        return memberRepository.save(member);
    }
}
