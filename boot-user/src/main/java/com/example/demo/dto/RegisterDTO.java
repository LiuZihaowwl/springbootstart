package com.example.demo.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class RegisterDTO {
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @Length(min = 8,max = 20,message = "密码必须是8到20位")
    private String pasword;
}
