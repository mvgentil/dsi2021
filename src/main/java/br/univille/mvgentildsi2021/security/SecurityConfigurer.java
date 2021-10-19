package br.univille.mvgentildsi2021.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.univille.mvgentildsi2021.service.impl.MyUserDetailsServiceImpl;


@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
  
  @Autowired
  private MyUserDetailsServiceImpl myUserDetailService;

  protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    auth.userDetailsService(myUserDetailService);
  }

  @Bean
  public PasswordEncoder passwordEncoder(){
    return NoOpPasswordEncoder.getInstance();
  }

}
