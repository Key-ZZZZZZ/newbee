package org.newbee.mall.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("NewBee Mall API 文档")
                        .description("基于 SpringDoc OpenAPI 的接口文档")
                        .contact(new Contact()
                                .name("开发团队")
                                .email("dev@newbee.mall"))
                        .version("1.0"));
    }
}