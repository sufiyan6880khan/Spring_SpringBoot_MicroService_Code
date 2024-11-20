package com.sk.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity 
@Table(name = "ARTIST_INFO")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Artist {
 
	@Id
	@Column(name = "ID")
	private Integer  id; 
	
	@Column(name="ANAME")
	@NonNull
	private  String aname;
	
	@Column(name = "ATYPE")
	@NonNull
	private String atype;
	
   @Column(name = "AFEE" )	
	@NonNull
	private Double afee;
	
}
