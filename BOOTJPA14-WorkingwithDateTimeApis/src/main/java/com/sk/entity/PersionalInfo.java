package com.sk.entity;

import java.time.LocalDate;
import java.time.LocalTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@Table(name = "Persional_Info")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class PersionalInfo {
	
	@Id
	@GeneratedValue
	private Integer pId;

	@Column(length = 30)
	@NonNull
	private String pName;
	
	@Column(length = 30)
	@NonNull
	private String Addr;
	@NonNull
	private LocalDate pDob;
	@NonNull
	private LocalTime pTob;
	@NonNull
	private LocalDate pDoj;
	
	
}
