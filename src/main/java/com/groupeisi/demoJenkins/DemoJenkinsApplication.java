package com.groupeisi.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		System.out.println(" La pipeline doit fonctionner, merci !!!");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
