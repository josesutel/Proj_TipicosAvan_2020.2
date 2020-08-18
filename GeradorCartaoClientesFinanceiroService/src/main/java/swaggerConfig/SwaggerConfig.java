package swaggerConfig;

import java.awt.JobAttributes.DestinationType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.collect.ImmutableList;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
	
	@Configuration
	@EnableSwagger2
	public class SwaggerConfig  {                                    
	    @Bean
	    public Docket api() { 
	     
	    	Docket docket =  new Docket(DestinationType.SWAGGER_2)
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("Ets.ModAdm.GeradorCartaoApi"))
	        .paths(PathSelectors.any())
	        .build()
	        .useDefaultResponseMessages(false)
	        .apiInfo(apiInfo());
	        
	        
	        return docket;
	    }
	    
	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Exemplo de API REST da aula de tópicos")
	                .description("Este e um projeto exemplo, para aula de tópicos avançados")
	                .version("1.0.0")                
	                .contact(new Contact("Marcelo Soares", "", "mbsoares.infor@gmail.com"))
	                .build();
	    }
	    
	   
	}


