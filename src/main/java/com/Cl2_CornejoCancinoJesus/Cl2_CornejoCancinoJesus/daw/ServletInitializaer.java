package com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.daw;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializaer  extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringDataCL2CornejoApplication.class);
	}
}
