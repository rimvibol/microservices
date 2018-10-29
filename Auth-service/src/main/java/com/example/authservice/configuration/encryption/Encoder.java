package com.example.authservice.configuration.encryption;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Rim vibol
 * Date : 10/29/2018, 9:18 AM
 * Email : vi.rim@gl-f.com
 */

@Configuration
public class Encoder {

    @Bean
    public PasswordEncoder oauthClientPasswordEncoder (){

        return new BCryptPasswordEncoder(4);
    }

    @Bean
    public PasswordEncoder userPasswordEncoder(){
        return new BCryptPasswordEncoder(8);

    }
}
