package com.uts.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.uts.blog패키지 이하를 스캔해서 모든파일을 메모리에 new하는것이 아니구요
//특정 어노테이션이 붙어있는 클래스 파일들을 new해서(Ioc) 스프링 컨테이너에 관리해줍니다.
@RestController
public class BlogControllerTest {
	
	//http://localhost:8085/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}