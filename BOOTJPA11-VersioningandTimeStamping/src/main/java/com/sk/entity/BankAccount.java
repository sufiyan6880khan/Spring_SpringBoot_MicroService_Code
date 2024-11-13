package com.sk.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.Temporal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@Table(name = "Bank_Info")
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class BankAccount {
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "accno_seq",initialValue = 900000000,allocationSize = 10)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE	)
	private Long accNo;
	
	@Column(length = 30)
	@NonNull
	private String holderName;
	@NonNull
	private Double balance;
	@Version
	private int modificationCount; 
	
  @CreationTimestamp
  @Column(insertable = true, updatable = false  )
	private LocalDateTime OpeningDate;
  
  @UpdateTimestamp
  @Column(length = 30, insertable = false, updatable = true )
  private LocalDateTime lastlyOperatedOn;
	
	

}