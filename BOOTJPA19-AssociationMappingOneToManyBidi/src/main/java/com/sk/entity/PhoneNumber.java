package com.sk.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JPA_PHONE_NUMBER")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regNo;
	@NonNull
	private Long mobileNo;
	@Column(length = 20)
	@NonNull
    private String provider;
	@NonNull
	@Column(length = 20)
	private String noType;
	
	// For building many to one association 
	@ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID",referencedColumnName = "UNO")
	private User user;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", noType="
				+ noType + "]";
	}
	
	
	
}
