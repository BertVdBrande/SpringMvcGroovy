package com.bertvdbrande.app

import com.bertvdbrande.springmvc.config.RootConfig
import com.bertvdbrande.springmvc.config.WebConfig
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer


class GreetingWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    def Class<?>[] getRootConfigClasses() {
        [RootConfig.class]
    }

    def Class<?>[] getServletConfigClasses() {
        [WebConfig.class]
    }

    def String[] getServletMappings() {
        ["/"]
    }
}