package com.sk.service;

import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Artist;
import com.sk.repositry.IArtistRepo;

@Service("artistService")
public class ImpArtistService implements IArtistService {

	@Autowired	
	private  IArtistRepo  art;
	
	// ===============================
	@Override
	public String resisterAtrtist(Artist artist) {
	 
		Artist  ar  =  art.save(artist); 
		return " Artist Obj saved with id value " + ar.getId();
	}

	//=====================================
	
	@Override
	public boolean checkArtist(Integer id) {
		  boolean flag = art.existsById(id);
		return flag;
	}
	
// ======================================
	@Override
	public Long countArtist() {

		return art.count();
	}
	
// ========================================
	@Override
	public String resisterArtistBulk(List<Artist> artist) {
		
		List<Artist> savedList = (List<Artist>) art.saveAll(artist);
		List<Integer> ids = savedList.stream().map(art -> art.getId()).collect(Collectors.toList());

		return ids.size() +" no.of Artist are saved with ids value :: "+ ids;
	}

// ======================================== 
	@Override
	public Iterable<Artist> showAllArtist() {
	       
		return art.findAll();
	}
	
// ===================================
	@Override
	public Iterable<Artist> showArtistbyId(Iterable<Integer> ids) {
		Iterable<Artist> list = art.findAllById(ids);
		return list;
	}

	//====================================
	@Override
	public Optional<Artist> showOArtistbyId(int id) {
	          Optional<Artist> opt = art.findById(id);
		return opt;
	}
	
	// ========================================
	@Override
	public String getArtistById(int id) {
	    Optional<Artist> opt = art.findById(id);
	    if (opt.isEmpty()) {
			 return "Artist not Found.....";
		} else {
           return "Artist iinfo is"+opt.get();
		}
	}

	// =======================================
	@Override
	public Artist fetchArtistById(int id) {
	           Optional<Artist> opt = art.findById(id);
	           if (opt.isPresent()) {
				return opt.get();
			} else {
               throw new IllegalArgumentException("invalid id");
			}
	
	}
	
	//============================================
	@Override
	public String InsertUpdateAdvanceById(Artist artist) {
		
		  art.save(artist);
		if (art.existsById(artist.getId())) {
			return artist.getAname() + "   Artist is updated......";
		} else {
            return artist.getAname()+ "  Artist is resistered.....";
		}
	}
	
	// ===============================================
	@Override
	public String deletebyid(int id) {
		Optional<Artist> opt = art.findById(id);
		if(opt.isPresent()) {
			Artist artist = opt.get();
		    art.deleteById(id);
		    return artist.getAname() + " artist is deleted......";
		}
		return "Artist not found plaese provide valid id....";
	}
	
	// =========================================
	@Override
	public String deleteAllbyId(Iterable<Integer> ids) {

	   Iterable<Artist> list = 	art.findAllById(ids);
	   art.deleteAllById(ids);
	   long count = StreamSupport.stream(list.spliterator(), false).count();

		return count +" no. of Artist deleted....";
	}
	
	// ===========================================================
	@Override
	public String deleteAllbyEntity(Iterable<Artist> artist) {
                     art.deleteAll(artist);
         long count = StreamSupport.stream(artist.spliterator(), false).count();          
         
		return count + " Artist deleted.....";
	}
	
// =======================================================	
	@Override
	public String deleteByEntity(Artist artist) {
	          
		Optional<Artist> opt = art.findById(artist.getId());
		if (opt.isPresent()) {
			art.delete(artist);	
			return artist.getAname()+" artist is deleted";
		}

		return " Artist is not Found Please provide valid artist info.......... ";
	}
	
	//============================================================
	@Override
	public String deleteAll() {
	       art.deleteAll();
		return  "All artist is deleted";
	}
	
	
}// end of class






















