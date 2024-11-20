package com.sk.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table( name = "Job_Seeker_Info")
@RequiredArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer jid; 

	@Column(length = 30)
	@NonNull
	private String name;
	
	@Column(length = 30)
	@NonNull
	private String Addr;
	
	@Lob
	@NonNull
	private byte[] photo;
	
	@Lob
	@NonNull
	private char[] resume;
	
	@NonNull
	private Boolean indian;
	
}
