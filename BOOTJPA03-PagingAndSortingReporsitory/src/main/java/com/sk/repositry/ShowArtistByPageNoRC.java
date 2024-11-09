package com.sk.repositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("showArtistByPageNo")
public class ShowArtistByPageNoRC implements CommandLineRunner {

	@Autowired
	public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Page<Artist> page = service.showArtisByyPageNo(2, 3);
		List<Artist> artist = page.getContent();
		artist.forEach(System.out::println);
		
		         System.out.println("--------------------------------------");
		
				System.out.println("current page no:"+(page.getNumber()+1));
				System.out.println("page size ::"+page.getSize());
				System.out.println("total no.of pages::"+page.getTotalPages());
				System.out.println("total no,of records on the current page::I"+page.getNumberOfElements());
				System.out.println("ls the current page is first page :::"+page.isFirst());
				System.out.println("ls the current page is last page :::"+page.isLast());

	}

}
