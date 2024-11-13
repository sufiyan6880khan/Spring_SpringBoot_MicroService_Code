package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sk.entity.Artist;

import jakarta.transaction.Transactional;

public interface IArtistRepo extends JpaRepository<Artist, Integer> {

	
	@Modifying
	@Transactional
//	@Query(value = "INSERT INTO ARTIST_INFO VALUES(id_seq.nextval, :name, :type ,:fee  )", nativeQuery = true)
	@Query(value = "INSERT INTO ARTIST_INFO VALUES(:id, :name, :type ,:fee)", nativeQuery = true)
	public int resisterArtist( Integer id , String name , String type , Double fee);
	
	
	   
//			@Modifying
//			@Transactional
//	//		 @Query(value=	"CREATE TABLE TEMP2 (col number(5))",nativeQuery = true)
//			@Query(value = "CREATE TABLE TEMP (col1 NUMBER(5))", nativeQuery = true)
//			public int	createTempTabIe();
			
	


}
