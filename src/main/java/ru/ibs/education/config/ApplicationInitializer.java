package ru.ibs.education.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Класс инициализации web-приложения.
 *
 * @author vbotalov
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /** Путь Spring Dispatcher Servlet-a. */
    private static final String API_PATH = "/api/*";

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ServicesConfiguration.class, DatabaseConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{API_PATH};
    }

}
