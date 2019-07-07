package com.gannabattula.apiondocker;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.gannabattula.resource.ApiService;

@Component
public class ResourceConfiguration extends ResourceConfig {

	public ResourceConfiguration(){
		register(ApiService.class);
	}
	
}
