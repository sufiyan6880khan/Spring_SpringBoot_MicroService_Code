package com.sk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sk.entity.Artist;

public interface IArtistRepo extends JpaRepository<Artist, Integer> {
	
	@Query("select count(distinct aname	) from Artist")
	public long fetchArtistbyName();
	
	@Query("select count(*),max(afee),min(afee),avg(afee),sum(afee) from Artist")
	public Object fetchAggregateData();
	
	
	 
}
