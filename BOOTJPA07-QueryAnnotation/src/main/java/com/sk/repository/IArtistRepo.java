package com.sk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sk.entity.Artist;

public interface IArtistRepo extends JpaRepository<Artist, Integer> {
	
	// @Query("from Artist")
	 @Query("Select art from Artist art")	
	public List<Artist> showAllArtist();


	 @Query(" from Artist where afee>=?1 AND afee<=?2")
	 public List<Artist> showArtistByFee(int intial , int last);
	 
}
