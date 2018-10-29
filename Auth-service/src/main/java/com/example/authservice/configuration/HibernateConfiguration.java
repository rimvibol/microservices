package com.example.authservice.configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import sun.security.pkcs11.Secmod;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

/**
 * Created by Rim vibol
 * Date : 10/29/2018, 9:05 AM
 * Email : vi.rim@gl-f.com
 */

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

    @Bean
    public Module hibernate5Module() {

        return new Hibernate5Module();
    }
    @Bean
    public PlatformTransactionManager transactionManager (EntityManagerFactory factory){
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(factory);
        return jpaTransactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor processor (){
        return  new PersistenceExceptionTranslationPostProcessor();
    }
}
