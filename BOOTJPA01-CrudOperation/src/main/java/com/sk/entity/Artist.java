package com.sk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Table(name = "ARTIST_INFO")
@Data
public class Artist {
 
	@Id
	@Column(name = "ID")
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer  id; 
	
	@Column(name="ANAME")
	private  String aname;
	
	@Column(name = "ATYPE")
	private String atype;
	
   @Column(name = "AFEE" )	
	private Double fee;
	
}
