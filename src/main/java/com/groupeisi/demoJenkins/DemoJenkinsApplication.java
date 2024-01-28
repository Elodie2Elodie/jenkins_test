package com.groupeisi.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		System.out.println(" Esperons que la pipeline fonctionne !!!");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
