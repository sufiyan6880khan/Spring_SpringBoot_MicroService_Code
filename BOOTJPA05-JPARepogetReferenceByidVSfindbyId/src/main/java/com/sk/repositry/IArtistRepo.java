package com.sk.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sk.entity.Artist;

public interface IArtistRepo extends  JpaRepository<Artist, Integer>
{

}
