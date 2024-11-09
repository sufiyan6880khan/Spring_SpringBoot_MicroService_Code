package com.sk.service;


import java.util.List;
import java.util.Optional;

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
	public Optional<Artist> findByid(int a) {
		return art.findById(a);
	}

	@Override
	public Artist getReferenceByid(int b) {
             return art.getReferenceById(b);
	}

	

	
}// end of class
