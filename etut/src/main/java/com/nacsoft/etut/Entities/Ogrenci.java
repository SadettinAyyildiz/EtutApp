package com.nacsoft.etut.Entities;

import javax.persistence.*;
import com.nacsoft.etut.Entities.Ogrenci;

import lombok.Data;

@Entity                         
@Table(name="ogrenci")
@Data
public class Ogrenci {

	@Id
	@Column(name="ogrenci_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ogrenciId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="adi")
	private String adi;
	
	@Column(name="soyadi")
	private String soyadi;
	
}
