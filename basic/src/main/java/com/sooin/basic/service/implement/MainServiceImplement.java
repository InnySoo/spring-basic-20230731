package com.sooin.basic.service.implement;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sooin.basic.entity.UserEntity;
import com.sooin.basic.repository.UserRepository;
import com.sooin.basic.service.MainService;

import lombok.RequiredArgsConstructor;

// description: Service - 레이어드 아키텍처 상의 비즈니스 영역 //
// description: 실제 비즈니스 로직(연산, 유효성 검사)이 작성되는 구역 //

// description: @Service - 해당 클래스가 Service 영역임을 명시 //
// description: @Component를 포함하고 있어서 Spring Bean으로 등록할 수 있음 //
// description: Spring Bean으로 등록을 해야 Spring에게 IoC 할 수 있음 //
@Service
@RequiredArgsConstructor
public class MainServiceImplement implements MainService {

  private final UserRepository userRepository;

  // description: PasswordEncoder 인터페이스 - 비밀번호를 안전하게 저장하고 검증해주는 인터페이스 //
  // description: BCryptPasswordEncoder - BCrypt 해싱 알고리즘으로 비밀번호를 암호화하여 인코딩하는 PasswordEncoder 구현체 //
  private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

  @Override
  public String hello() {
    UserEntity userEntity = new UserEntity("email@email.com", "qwerqwer", "sooin", "01012341234", "서울특별시", "jingu", null);
    userRepository.save(userEntity);
    return "hello world";
  }

  @Override
  public String getRepository() {
    List<UserEntity> userEntity = userRepository.findByNicknameOrAddress("nickname", "서울특별시");
    return userEntity.toString();
  }

  @Override
  public String getPasswordEncoding(String password) {
    // description: String encode(String password) - 매개변수로 전달된 패스워드를 복호화 할 수 없는 단방향 암호화로 암호화 함 //
    String encodedPassword = passwordEncoder.encode(password);
    return encodedPassword;
  }

  @Override
  public boolean isPasswordMatch(String password, String encodedPassword) {
    // description: boolean matches(String rawPassword, String encodedPassword) //
    // description: rawPassword가 encodedPassword의 원문과 같은 지 비교 //
    boolean isMatched = passwordEncoder.matches(password, encodedPassword);
    return isMatched;
  }
  
}
