package com.sk.repositry;

import org.springframework.data.repository.CrudRepository;

import com.sk.entity.Artist;

public interface IArtistRepo extends CrudRepository<Artist, Integer>
{

}
