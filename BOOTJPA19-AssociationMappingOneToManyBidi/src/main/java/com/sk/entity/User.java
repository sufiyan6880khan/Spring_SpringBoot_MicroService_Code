package com.sk.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JPA_USER_INFO")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "UNO_SEQ", initialValue = 1000, allocationSize = 10)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer uno;

	@NonNull
	@Column(length = 20)
	private String uname;
	@NonNull
	@Column(length = 30)
    private String uaddr;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL , mappedBy = "user" )

	private Set<PhoneNumber> phoneInfo;
	
	@Override
	public String toString() {
		return "User [uno=" + uno + ", uname=" + uname + ", uaddr=" + uaddr + "]";
	}

	
}
