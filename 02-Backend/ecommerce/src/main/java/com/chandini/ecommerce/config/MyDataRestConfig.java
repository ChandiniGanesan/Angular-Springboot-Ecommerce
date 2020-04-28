package com.chandini.ecommerce.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.chandini.ecommerce.entity.Product;
import com.chandini.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	HttpMethod[] theUnsupportedActionsHttpMethods= {HttpMethod.DELETE,HttpMethod.PUT,HttpMethod.POST};
	
	
	//disable HTTP methods for Producer:PUT,POST,DELETE
	config.getExposureConfiguration() 
		.forDomainType(Product.class) 
		.withItemExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActionsHttpMethods))
		.withCollectionExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActionsHttpMethods));
	
	
	
	//disable HTTP methods for ProductCategory: PUT,POST, and DELETE
	config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActionsHttpMethods))
		.withCollectionExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActionsHttpMethods));
	}

}
