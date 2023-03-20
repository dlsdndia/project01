package com.example.project01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
	
	// 스프링부트에서는 CorsFilter와 UrlBasedCorsConfigurationSource를 사용하여 CORS 설정을 적용
	// 이 방식은 스프링 부트의 자동 구성 기능과 잘 어울리며, 코드가 더 간결
	//@Bea 등록시 스프링컨테이너에서 관리하고 cors관련 이슈에는 자동으로 필터를 타기 때문에 불필요한 public을 사용하여 공개를 피할 수 있음
    @Bean
    CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:3000");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
    
}
