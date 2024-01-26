package com.groupeisi.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Mon premier depôt d'artefact sur Nexus!!!");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
