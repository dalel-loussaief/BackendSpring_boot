package com.dalel.vetements.dto;

import java.util.Date;

import com.dalel.vetements.entities.Genre;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VetementDTO {
	private Long idvetement;
	private String nomvetement;
	private Double prixvetement;
	private Date dateprod;
	private Genre genre;
	
	private String nom;
	
	
	
	
	public VetementDTO(Long idvetement, String nomvetement, Double prixvetement, Date dateprod, String nom,Genre genre) {
		super();
		this.idvetement = idvetement;
		this.nomvetement = nomvetement;
		this.prixvetement = prixvetement;
		this.dateprod = dateprod;
		this.nom = nom;
		this.genre = genre;
	}
	public VetementDTO() {
		super();
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Long getIdvetement() {
		return idvetement;
	}
	
	public  void setIdvetement(Long idvetement) {
		this.idvetement = idvetement;
	}
	public String getNomvetement() {
		return nomvetement;
	}
	public void setNomvetement(String nomvetement) {
		this.nomvetement = nomvetement;
	}
	public Double getPrixvetement() {
		return prixvetement;
	}
	public void setPrixvetement(Double prixvetement) {
		this.prixvetement = prixvetement;
	}
	public Date getDateprod() {
		return dateprod;
	}
	public void setDateprod(Date dateprod) {
		this.dateprod = dateprod;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	/*public static Object builder() {
	
		return null;
	}*/
	
	
	
}
