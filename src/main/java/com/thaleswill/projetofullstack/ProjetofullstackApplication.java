package com.thaleswill.projetofullstack;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thaleswill.projetofullstack.domain.Categoria;
import com.thaleswill.projetofullstack.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetofullstackApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetofullstackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 =new Categoria(null, "Informática");
		Categoria cat2 =new Categoria(null, "Escritório");
		Categoria cat3 =new Categoria(null, "Games");
		Categoria cat4 =new Categoria(null, "Eletrônicos");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
	}

}
