package com.example.demo.controller;

import com.example.demo.entity.Hello;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@RestController
@Slf4j
@RequiredArgsConstructor
public class HelloRestController {

    final MemberService memberService;

    @GetMapping(value = "/hello-string")
    public String helloString(String name) {
        // MemberService memberservice = new ...
        return memberService.greet(name);
//        return String.format("Hello, %s", name);
    }

    @GetMapping("/hello-map")
    public Map<String, Object> helloMap(String name) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    @GetMapping("/hello-object")
    public Hello helloObject(String name) {
        Hello h = new Hello(name);
        // -> byte[]
        String a = "abc";
        a.getBytes(StandardCharsets.UTF_8);
        return h;
    }

}
