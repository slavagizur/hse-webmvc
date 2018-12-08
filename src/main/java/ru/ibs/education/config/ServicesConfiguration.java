package ru.ibs.education.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.ibs.education.services.CalculationService;
import ru.ibs.education.services.DBCalculationService;

/**
 * Настройка сервисов приложения.
 *
 * @author vbotalov
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ru.ibs.education.controllers", "ru.ibs.education.services"})
public class ServicesConfiguration {

    @Bean
    @Qualifier("database")
    public CalculationService getDatabaseService() {
        return new DBCalculationService();
    }
}
