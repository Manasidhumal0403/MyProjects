package com.manasi.hospitalmanagement_springboot.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//url of swagger: http://localhost:8081/swagger-ui.html#
@Configuration
@EnableSwagger2
public class ApplicationConfig {
	@Bean
	public Docket getDocket() {
		Contact contact=new Contact("HCL","http://hcl.com", "manasidhumal1999@gmail.com");
		List<VendorExtension> extensions=new ArrayList<>();
		ApiInfo apiInfo=new ApiInfo("Hospital Mnagement System", "This application is use for to manage and maintain the detail of the patient in an hosptal", "Version 1.0", "1 Year free services", contact, "hcl001", "http://hcl001.com", extensions);
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.manasi.hospitalmanagement_springboot"))
				.build().apiInfo(apiInfo).useDefaultResponseMessages(false);

	}

}
