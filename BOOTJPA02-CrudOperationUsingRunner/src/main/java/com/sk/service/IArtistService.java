
package com.sk.service;

import java.util.List;
import java.util.Optional;

import com.sk.entity.Artist;

public interface IArtistService {
	
	public String resisterAtrtist (Artist artist);
	public boolean checkArtist(Integer id);
	public Long countArtist();
	public String resisterArtistBulk(List<Artist> artist);
	public Iterable<Artist> showAllArtist();
	public Iterable<Artist> showArtistbyId(Iterable<Integer> ids);
	public Optional<Artist> showOArtistbyId(int id);
	public String getArtistById(int id);
	public  Artist fetchArtistById(int id);
	public  	String InsertUpdateAdvanceById(Artist artist);
	
	public String deletebyid(int id);
	public String deleteAllbyId(Iterable<Integer> ids);
	public  String deleteAllbyEntity(Iterable<Artist> artistr);
	public String deleteByEntity(Artist artist);
	public String deleteAll();
	
	

}
