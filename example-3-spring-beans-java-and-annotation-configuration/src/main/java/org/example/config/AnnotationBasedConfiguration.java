package org.example.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This class provides an annotation-based configuration for Spring's component scanning.
 *
 * <p>The {@code @ComponentScan} annotation tells Spring to scan the specified package
 * (in this case, {@code "org.example.automobile"} and {@code "org.example.services.impl"}) and its subpackages for classes
 * annotated with {@code @Component}, {@code @Service}, {@code @Repository}, {@code @Controller},
 * and other related annotations. These classes will be automatically registered as Spring beans
 * in the application context.</p>
 *
 * <p>This configuration is typically used in combination with the {@code @Configuration}
 * annotation to define a Spring configuration class.</p>
 */
@Configuration
@ComponentScan(basePackages = {"org.example.automobile", "org.example.services.impl"})
public class AnnotationBasedConfiguration {
}
