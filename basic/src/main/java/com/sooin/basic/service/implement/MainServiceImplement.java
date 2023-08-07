package com.sooin.basic.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sooin.basic.entity.UserEntity;
import com.sooin.basic.repository.UserRepository;
<<<<<<< HEAD
import com.sooin.basic.service.MainSerivce;
=======
import com.sooin.basic.service.MainService;
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550

import lombok.RequiredArgsConstructor;

// description: Service - 레이어드 아키텍처 상의 비즈니스 영역 //
// description: 실제 비즈니스 로직(연산, 유효성 검사)이 작성되는 구역 //

// description: @Service - 해당 클래스가 Service 영역임을 명시 //
// description: @Component를 포함하고 있어서 Spring Bean으로 등록할 수 있음 //
<<<<<<< HEAD
// description: Spring Bean으로 등록해야 Spring에게 IoC 할 수 있음 //
@Service
@RequiredArgsConstructor
public class MainServiceImplement implements MainSerivce {
=======
// description: Spring Bean으로 등록을 해야 Spring에게 IoC 할 수 있음 //
@Service
@RequiredArgsConstructor
public class MainServiceImplement implements MainService {
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550

  private final UserRepository userRepository;

  @Override
  public String hello() {
<<<<<<< HEAD
    UserEntity userEntity = new UserEntity("email@email.com", "qwerqwer", "nickname", "01011111111", "서울특별시", "부산진구", null);
=======
    UserEntity userEntity = new UserEntity("email@email.com", "qwerqwer", "sooin", "01012341234", "서울특별시", "jingu", null);
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550
    userRepository.save(userEntity);
    return "hello world";
  }

  @Override
  public String getRepository() {
<<<<<<< HEAD
    List<UserEntity> userEntity = userRepository.findByNicknameOrAddress("nickname", "서울특별시");
=======
    List<UserEntity> userEntity = userRepository.findByNickname("sooin");
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550
    return userEntity.toString();
  }
  
}
