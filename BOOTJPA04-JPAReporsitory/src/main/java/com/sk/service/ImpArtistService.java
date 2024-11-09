package com.sk.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.sk.entity.Artist;
import com.sk.repositry.IArtistRepo;

@SuppressWarnings("unchecked")
@Service("artistService")
public class ImpArtistService implements IArtistService {

	@Autowired
	private  IArtistRepo  art;

	@Override
	public String deleteArtistByIdInBatch(List<Integer> ids) {
	    
		List<Artist> list = art.findAllById(ids);
		 
		art.deleteAllByIdInBatch(ids);
		
		return list.size()+" record deleted....";
	}

	@Override
	public List<Artist> showArtistByExampleData(String name, double fee) {
		
		Artist artist = new Artist();artist.setAname(name);artist.setFee(fee);
		
		Example example = Example.of(artist);
		
	
		List<Artist> list = art.findAll(example);
		
		
		return  list;
	}

	
}// end of class
