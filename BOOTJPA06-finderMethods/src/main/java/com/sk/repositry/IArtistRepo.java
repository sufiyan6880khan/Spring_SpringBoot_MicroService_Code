package com.sk.repositry;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Artist;

public interface IArtistRepo extends  JpaRepository<Artist, Integer>
{

	// RCclass name =  FindByAnameEqualsRC
	public  List<Artist>  findByAnameEquals(String name);
	public  List<Artist>  findByAnameIs(String name);
	public  List<Artist>  findByAname(String name);
	public  List<Artist>  findByAnameEqualsIgnoreCase(String name);
	 
	
	// RCclass name =  FindByAtypeContainsOrNot
	public List<Artist> findByAtypeStartingWith(String initChar);
	public List<Artist> findByAtypeEndingWith(String endChar);
	public List<Artist> findByAtypeContaining(String mchar);
	public List<Artist> findByAtypeContainingIgnoreCase(String mchar);  
	
	// RCclass name = FindByAtypeOrderByAfeeRc
	public Iterator<Artist> findByAnameOrderByafeeAsc(List<String> name);
	
	
	
	
}
