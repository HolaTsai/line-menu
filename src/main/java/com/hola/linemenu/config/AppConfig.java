package com.hola.linemenu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * @Author HolaTsai on 2022/10/30
 */
@Component
@MapperScan("com.hola.linemenu.dao")
public class AppConfig {


}
