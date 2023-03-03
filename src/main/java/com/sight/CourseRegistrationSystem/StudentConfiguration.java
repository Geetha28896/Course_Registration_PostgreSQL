package com.sight.CourseRegistrationSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

	@EnableWebSecurity
	public class StudentConfiguration extends WebSecurityConfigurerAdapter{
		
		@Override
		protected void configure(AuthenticationManagerBuilder amb)throws Exception{
			amb.inMemoryAuthentication()
			.withUser("student")
			.password("student@ss2022")
			.roles("STUDENT")
			.and()
			.withUser("admin")
			.password("Admin@ss2022")
			.roles("ADMIN");
		
		}
		
		@Override
		protected void configure(HttpSecurity http)throws Exception{
			http.authorizeRequests()
			.antMatchers("/admin").hasAnyRole("STUDENT","ADMIN")
			.antMatchers("/student").hasRole("STUDENT")
			.and().formLogin();
		}
		
		@Bean
		public PasswordEncoder getPasswordEncoded(){
			return NoOpPasswordEncoder.getInstance();
			
			
			
		}

	
}
