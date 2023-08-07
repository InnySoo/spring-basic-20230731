package com.sooin.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.sooin.basic.service.MainSerivce;
=======
import com.sooin.basic.service.MainService;
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550

import lombok.RequiredArgsConstructor;

@RestController
// description: http://localhost:8080/sub //
@RequestMapping("/sub")
@RequiredArgsConstructor
public class SubController {

<<<<<<< HEAD
  public final MainSerivce mainSerivce;
  
=======
  public final MainService mainService;

>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550
  @GetMapping("/")
  public String getMethod() {
    return "sub get method";
  }

  @GetMapping("/repository-get")
  public String getRepository() {
<<<<<<< HEAD
    return mainSerivce.getRepository();
=======
    return mainService.getRepository();
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550
  }

}
