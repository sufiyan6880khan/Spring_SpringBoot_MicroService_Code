package com.sk.service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;




import com.sk.entity.Artist;
import com.sk.repositry.IArtistRepo;

@Service("artistService")
public class ImpArtistService implements IArtistService {

	@Autowired
	private  IArtistRepo  art;
	
	@Override
	public Iterable<Artist> showArtistBySorting(boolean ascOrder, String... prop) {
		// prepare the Sort object
		Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC , prop);
		
		// invoke the methode 
		return  art.findAll(sort);
	
	}
	
	// ====================================================================

	@Override
	public Page<Artist> showArtisByyPageNo(int pageNo, int pageSize) {
//	
//		Pageable pageable = PageRequest.of(pageNo, pageSize);
//		
//		Page<Artist> page = art.findAll(pageable); 
//		
		 PageRequest pageable = PageRequest.of(pageNo, pageSize);
		    return art.findAll(pageable);
		    
		//return null;
	}
	
	// ================================================================

	@Override
	public void showArtistPageByPage(int pageSize, boolean ascOrder, String... props) {
	long count = art.count();
	long pageCount = count/pageSize;
	if(count%pageCount != 0) 
		    pageCount = ++pageCount;
	
	Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC , props);
	
	for (int i = 0; i <= pageCount; ++i) {
		
		 PageRequest pageable = PageRequest.of(i, pageSize);
		 
		 Page<Artist> page = art.findAll(pageable);
		 
		 page.forEach(System.out::println);
		  
		 System.out.println("--------------------"+(page.getNumber()+1)+"/"+page.getTotalPages()+"------------------------");
		
	}

	}
	
	
	
}// end of class
