package com.dalel.vetements;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.dalel.vetements.entities.Genre;
import com.dalel.vetements.entities.Vetement;

@SpringBootApplication
public class VetementsdemoApplication  implements CommandLineRunner{

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(VetementsdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		repositoryRestConfiguration.exposeIdsFor(Vetement.class,Genre.class);
	}
	@Bean
	public ModelMapper modelMapper()
	{
	return new ModelMapper();
	}
}
