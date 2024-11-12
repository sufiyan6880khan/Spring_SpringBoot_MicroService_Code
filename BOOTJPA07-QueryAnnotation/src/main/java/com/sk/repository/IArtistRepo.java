package com.sk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sk.entity.Artist;

public interface IArtistRepo extends JpaRepository<Artist, Integer> {
	
	// @Query("from Artist")
	 @Query("Select art from Artist art")	
	public List<Artist> showAllArtist();


	 @Query(" from Artist where afee>=?1 AND afee<=?2")
	 public List<Artist> showArtistByFee(int intial , int last);
	 
	 
	 // runner class = FetchNamedParam
	 @Query(" from Artist where afee>=:intial AND afee<=:last")
	 public List<Artist>  fetchArtistByFee(int intial , int last);
	 
	 @Query(" from Artist where afee>=:min AND afee<=:max")
	 public List<Artist>  fetchParamArtistByFee(@Param("min") int initial ,@Param("max")  int last);
	 
	 
	 
}
