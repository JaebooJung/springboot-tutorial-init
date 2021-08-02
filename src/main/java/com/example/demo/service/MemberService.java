package com.example.demo.service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public String greet(String name){
        return String.format("Welcome, %s", name);
    }
}
