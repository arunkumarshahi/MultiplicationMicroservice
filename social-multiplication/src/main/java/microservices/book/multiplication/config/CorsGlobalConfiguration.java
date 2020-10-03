package microservices.book.multiplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsGlobalConfiguration {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				 registry.addMapping("/**").allowedMethods("*");
				// registry.addMapping("/**").
				// allowedOrigins("http://localhost:9090","http://localhost:3000");
				//registry.addMapping("/**").allowedOrigins("http://localhost:8000","http://localhost:3000").allowedHeaders("*");
			}
		};
	}
}