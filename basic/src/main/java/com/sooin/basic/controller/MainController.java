package com.sooin.basic.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sooin.basic.dto.request.PostRequestBodyDto;

// description: Controller - 레이어드 아키텍터 상의 프레젠테이션 영역 //
// description: 사용자로부터 입력을 받고 서비스 결과를 반환하는 영역 //

// description: @RestController - REST API 형식의 Response를 반환하는 Controller임을 명시 //
// description: REST API 형식의 Response - Response 타입이 JSON 형태인 Response //
@RestController
// description: @RequestMapping - Request의 URL 패턴에 따라 클래스 및 메소드를 결정하는 어노테이션 //
// description: 예) http://localhost:8080 //
@RequestMapping("")
public class MainController {

  // description: @RequestMapping 중 Get method에 대해서만 인식 //
  @GetMapping("/")
  public String getMethod() {
    return "get method";
  }

  // description: @RequestMapping 중 Post method에 대해서만 인식 //
  @PostMapping("/")
  public String postMethod() {
    return "post method";
  }

  // description: @RequestMapping 중 Patch method에 대해서만 인식 //
  @PatchMapping("/")
  public String patchMethod() {
    return "patch method";
  }

  // description: @RequestMapping 중 Put method에 대해서만 인식 //
  @PutMapping("/")
  public String putMethod() {
    return "put method";
  }

  // description: @RequestMapping 중 Delete method에 대해서만 인식 //
  @DeleteMapping("/")
  public String deleteMethod() {
    return "delete method";
  }

  // description: @PathVariable - Path 자체를 변수의 값으로 인식 //
  @GetMapping("/path-variable/{value}")
  public String getPathVariable(@PathVariable("value") String value) {
    return "입력한 Path Variable은 " + value + " 입니다.";
  }

  @GetMapping("/parameter")
  public String getParameter(
    @RequestParam("name") String name,
    @RequestParam("age") int age
  ) {
    return "이름 : " + name + " 나이 " + age;
  }

  @PostMapping("/request-body")
  public String postRequestBody(
    // @RequestBody String requestBody
    @RequestBody PostRequestBodyDto requestBody
  ) {
    return "입력한 Request Body 는 " + requestBody.getName() + "입니다.";
  }
  
}
