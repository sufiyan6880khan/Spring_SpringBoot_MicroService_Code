package com.sk.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Artist;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@SuppressWarnings("all")
@Service
public class ArtistServiceImpl implements IArtistServicemgmnt {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Artist> showArtistByfee(double start, double end) {
     
		StoredProcedureQuery query =  manager.createStoredProcedureQuery(" P_GET_ARTIST_BY_FEE",Artist.class);
		
		query.registerStoredProcedureParameter(1, Float.class, ParameterMode.IN); 
		query.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		
		query.setParameter(1, BigDecimal.valueOf(start));
		query.setParameter(2, BigDecimal.valueOf(end));
		
		List<Artist> list = query.getResultList();
		return list;
	}

}
