package com.sooin.basic.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostRequestBodyDto {
  @NotBlank
  private String name;
  @NotNull
  private Integer age;
<<<<<<< HEAD
}
=======
  
}
>>>>>>> ab15a8a34791e75ce94e884337d6e1a8ddfe5550
