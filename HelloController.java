package inhatc.spring.shop.controller;

import inhatc.spring.shop.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 이 곳에서 타고 들어옴.
//@Controller // resources - templates 로 이동
public class HelloController {

    @GetMapping("/")
    public UserDto hello(){
        UserDto userDto = UserDto.builder().name("김길동").age(10).build();
        userDto.setAge(20);
        userDto.setName("홍길동");
        System.out.println("userDto : " + userDto);
        return userDto;
    }

}
