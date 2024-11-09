
package com.sk.service;


import java.util.Optional;

import com.sk.entity.Artist;


public interface IArtistService {
	
	
	public Optional<Artist>  findByid(int a);
	public Artist  getReferenceByid(int b);
	
	
}
