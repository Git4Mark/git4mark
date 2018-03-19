package com.jeesite.modules.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <Description> <br>
 *
 * @author mark<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate Oct 24, 2016 <br>
 * @since V8.1<br>
 * @see com.jeesite.modules.test.web
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = { "com.jeesite.modules.test.web" })
public class SwaggerConfig {
    /**
     *
     * Description: <br>
     *
     * @author luoluocaihong<br>
     * @taskId <br>
     * @return <br>
     */
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("JeeSite Web SelfService APIs")
                .description("")
                .license("")
                .licenseUrl("")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }

    /**
     *
     * Description: <br>
     *
     * @author luoluocaihong<br>
     * @taskId <br>
     * @return <br>
     */
    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jeesite.modules.test.web"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

}
