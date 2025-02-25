package com.almeida.coding.mongodemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.almeida.coding.mongodemo.category.Category;
import com.almeida.coding.mongodemo.category.CategoryRepository;
import com.almeida.coding.mongodemo.product.Product;
import com.almeida.coding.mongodemo.product.ProductRepository;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(
		ProductRepository repository,
		CategoryRepository categoryRepository
	) {
		return args -> {
			var category = Category.builder()
			.name("cat 1")
			.description("cat 1")
			.build();

			var category2 = Category.builder()
			.name("cat 2")
			.description("cat 2")
			.build();

			categoryRepository.insert(category);
			categoryRepository.insert(category2);
			var product = Product.builder()
				.name("iphone")
				.description("Smart phone")
				.build();
			repository.insert(product);
		};
	}
}
