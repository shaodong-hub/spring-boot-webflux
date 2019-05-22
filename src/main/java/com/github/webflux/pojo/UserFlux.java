package com.github.webflux.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 创建时间为 12:51 2019-05-21
 * 项目名称 spring-boot-webflux
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFlux {

    @NotBlank
    private String name;

    private String pass;

}
