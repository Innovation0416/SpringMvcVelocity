package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
public class WebSecurityConfig  implements WebMvcConfigurer{
	/**
	 * login user session key
	 */
	public final static String SESSION_KEY = "loginUserInfo";

	@Bean
	public SecurityInterceptor getSecurityInterceptor() {
		return new SecurityInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
		//exclude page
		addInterceptor.excludePathPatterns("/ssm/layout/layout");
		addInterceptor.excludePathPatterns("/ssm/error");
		addInterceptor.excludePathPatterns("/ssm/login");
		addInterceptor.excludePathPatterns("/ssm/register");
		addInterceptor.excludePathPatterns("/ssm/do**");
		addInterceptor.excludePathPatterns("/ssm/go**");
		addInterceptor.excludePathPatterns("/ssm/index");
		addInterceptor.excludePathPatterns("/ssm/itemDetails");
		addInterceptor.excludePathPatterns("/ssm/style");
		addInterceptor.excludePathPatterns("/css/**");
		addInterceptor.excludePathPatterns("/js/**");
		addInterceptor.excludePathPatterns("/img/**");
		addInterceptor.excludePathPatterns("/fonts/**");
		//addInterceptor.excludePathPatterns("/ssm/home");
		//filter page
		addInterceptor.addPathPatterns("/**");
	}

	private class SecurityInterceptor extends HandlerInterceptorAdapter {
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
			HttpSession session = request.getSession();
			if (session.getAttribute(SESSION_KEY) != null) {
				return true;
			} else {
				response.sendRedirect("/ssm/error");
				return false;
			}
		}
	}
}