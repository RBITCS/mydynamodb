package com.rbit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResponseConfig implements WebMvcConfigurer{
	
	@Override
	  public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		  configurer.favorPathExtension(false).
		  favorParameter(true).
		  parameterName("mediaType").
		  ignoreAcceptHeader(true).
		  useRegisteredExtensionsOnly(false).
		  mediaType("xml", MediaType.APPLICATION_XML).
		  mediaType("json", MediaType.APPLICATION_JSON).
		  defaultContentType(MediaType.APPLICATION_JSON);
		  
	  }
}
