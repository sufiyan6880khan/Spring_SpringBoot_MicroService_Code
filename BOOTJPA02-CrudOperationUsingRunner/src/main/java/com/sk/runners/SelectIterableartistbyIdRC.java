package com.sk.runners;


import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("selectById")
public class SelectIterableartistbyIdRC implements CommandLineRunner {
	

	@Autowired
	private IArtistService service;  

	@Override
	public void run(String... args) throws Exception {
		try {
			
			
			service.showArtistbyId(Arrays.asList(1,2,5,70,52,null)).forEach(System.out::println);
			
			//                (OR)
           		
//			List<Integer> list = Arrays.asList(400,395,1,50,527);
//			Iterable<Artist> list1 = service.showArtistbyId(list);
//			
//			if (!(list1 == null)) {
//				list1.forEach(art-> {
//					System.out.println("=====================");
//					System.out.println(art);
//				});
//			}   
//			else {
//				System.out.println("************************");
//				   System.out.println("Artist Not found..... ");
//			}
//			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
