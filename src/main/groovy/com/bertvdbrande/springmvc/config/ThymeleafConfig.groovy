package com.bertvdbrande.springmvc.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.spring3.SpringTemplateEngine
import org.thymeleaf.spring3.view.ThymeleafViewResolver
import org.thymeleaf.templateresolver.ServletContextTemplateResolver
import org.thymeleaf.templateresolver.TemplateResolver

@Configuration
class ThymeleafConfig {

    @Bean
    TemplateResolver templateResolver() {
        return new ServletContextTemplateResolver(
                prefix: '/WEB-INF/templates/',
                suffix: '.html',
                templateMode: 'HTML5')
    }

    @Bean
    SpringTemplateEngine templateEngine() {
        return new SpringTemplateEngine(templateResolver: templateResolver())
    }

    @Bean
    ThymeleafViewResolver viewResolver() {
        return new ThymeleafViewResolver(
                templateEngine: templateEngine(),
                order: 1
        )
    }
}