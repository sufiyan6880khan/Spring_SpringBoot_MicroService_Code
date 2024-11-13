package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sk.entity.Artist;

import jakarta.transaction.Transactional;

public interface IArtistRepo extends JpaRepository<Artist, Integer> {
	

//	@Transactional
//	@Modifying
//	@Query("UPDATE Artist SET afee = afee + (afee  * :percent / 100.0) WHERE atype = :type") // Artist name is case sensitive 
//	  public int hikeArtsistFeeBytype(String type , int percent);
	
	
	@Transactional
	@Modifying
	@Query(" delete from  Artist WHERE afee>=:start AND afee<=:end")
	public int deleteArtistByFee(int start , int end);

}
