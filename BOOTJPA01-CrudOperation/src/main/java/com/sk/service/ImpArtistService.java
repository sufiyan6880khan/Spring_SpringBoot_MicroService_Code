package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Artist;
import com.sk.repositry.IArtistRepo;

@Service("artistService")
public class ImpArtistService implements IArtistService {

	@Autowired
	private  IArtistRepo  art;
	
	@Override
	public String resisterAtrtist(Artist artist) {
	 
		Artist  ar  =  art.save(artist); 
		return " Artist Obj saved with id value " + ar.getId();
	}
}
