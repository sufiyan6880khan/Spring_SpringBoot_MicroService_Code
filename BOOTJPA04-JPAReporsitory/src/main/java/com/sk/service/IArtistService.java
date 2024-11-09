
package com.sk.service;


import java.util.List;

import com.sk.entity.Artist;


public interface IArtistService {
	
	public String deleteArtistByIdInBatch(List<Integer> ids);
    public List<Artist> showArtistByExampleData(String name, double fee);
}
