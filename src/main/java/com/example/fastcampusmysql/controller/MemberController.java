package com.example.fastcampusmysql.controller;

import com.example.fastcampusmysql.domain.dto.MemberRegisterCommand;
import com.example.fastcampusmysql.domain.entity.Member;
import com.example.fastcampusmysql.domain.service.MemberWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {
    final private MemberWriteService memberWriteService;

    @PostMapping("/members")
    public Member register(@RequestBody MemberRegisterCommand command) {
        return memberWriteService.create(command);
    }



}
