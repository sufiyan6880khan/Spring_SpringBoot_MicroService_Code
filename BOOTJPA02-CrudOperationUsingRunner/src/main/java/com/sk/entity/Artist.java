package com.sk.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity 
@Table(name = "ARTIST_INFO")
@Data
@AllArgsConstructor
public class Artist {
 
	@Id
	@Column(name = "ID" )
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer  id; 
	
	public Artist(String aname, String atype, Double fee) {
		this.aname = aname;
		this.atype = atype;
		this.fee = fee;
	}
	public Artist() {

	}
	@Column(name="ANAME" , length = 20 )
	private  String aname;
	
	@Column(name = "ATYPE" , length = 20 )
	// @Transient
	private String atype;
	
   @Column(name = "AFEE" )	
   private Double fee;
	
}
