
package com.sk.service;


import org.springframework.data.domain.Page;

import com.sk.entity.Artist;

public interface IArtistService {
	
	public Iterable<Artist> showArtistBySorting(boolean sortOrder, String... prop);
	public  Page<Artist> showArtisByyPageNo(int pageNo, int pageSize);
	public void showArtistPageByPage(int pageSize, boolean ascOrder, String... props);
 
}
