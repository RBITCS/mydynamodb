package com.rbit.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyDynamodbApplication {

	@Autowired
	ProductInfoRepository infoRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyDynamodbApplication.class, args);
	}
	
	
	  @RequestMapping("/") String test() { return "This is test"; }
	 
	 
	/*
	 * @RequestMapping("/") public Optional<ProductInfo> getProduct() {
	 * Optional<ProductInfo> productInfo = infoRepository.findById("123"); return
	 * productInfo; }
	 */

	
	/*
	 * @RequestMapping(value = "/product/info", method = RequestMethod.GET, produces
	 * = { "application/json", "application/xml" }) public ProductInfo
	 * getProductInfo() { //Optional<ProductInfo> productInfo =
	 * infoRepository.findById("123"); ProductInfo productInfo = new
	 * ProductInfo("123", "100", "200"); return productInfo; }
	 */
	 
	  
	  
	  
	  @RequestMapping(value = "/product/info", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	  public @ResponseBody ProductInfo getProductInfo() { 
		  //Optional<ProductInfo> productInfo = infoRepository.findById("123"); 
		  ProductInfo productInfo = new ProductInfo("123", "100", "200"); 
		  return productInfo; 
		  }
	  
}
