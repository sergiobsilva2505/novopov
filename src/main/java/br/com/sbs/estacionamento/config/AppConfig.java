package br.com.sbs.estacionamento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Classe de configuração para habilitar o suporte ao Spring MVC.
 * Configura o suporte básico do que precisamos para um projeto MVC
 * @author Sergio Bezerra
 *
 */

@EnableWebMvc // habilita o spring mvc
@Configuration
@ComponentScan(basePackages = {"br.com.sbs.estacionamento.controller"})
public class AppConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");		
	}
	
	/**
	 * Configurando um bean viewresolvwr que retorna as paginas jsp (views)
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/view/");
		bean.setSuffix(".jsp");
		
		return bean;
	}

}
