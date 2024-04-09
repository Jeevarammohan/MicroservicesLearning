package com.learning.java.itemCatalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient

public class ItemCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogApplication.class, args);
	}

}

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//class Item{
//	@Id
//	@GeneratedValue
//	private Long id;
//	private String name;
//
//	public Item(String item) {
//		this.name=item;
//	}
//}
//@RepositoryRestResource
//interface  ItemRepository extends JpaRepository<Item, Long> {
//
//}
//
//@Component
//class ItemInitializer implements CommandLineRunner {
//
//	private ItemRepository itemRepository;
//	ItemInitializer(ItemRepository itemRepository){
//
//        this.itemRepository = itemRepository;
//    }
//	@Override
//	public void run(String... args) throws Exception {
//		Stream.of("Lining","Bad Boy","PUMA","ADIDAS").forEach(item->itemRepository.save(new Item(item)));
//		itemRepository.findAll().forEach(System.out::println);
//	}
//}