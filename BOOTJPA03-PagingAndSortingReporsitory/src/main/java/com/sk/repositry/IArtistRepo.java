package com.sk.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sk.entity.Artist;

public interface IArtistRepo extends CrudRepository<Artist, Integer>, PagingAndSortingRepository<Artist, Integer>
{

}
