package com.groupeisi.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Ajout de l'etape Nexus à la pipeline, fonctionne please !!!");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
