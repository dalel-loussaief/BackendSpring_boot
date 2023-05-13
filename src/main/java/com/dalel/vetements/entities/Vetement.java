package com.dalel.vetements.entities;
import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vetement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idvetement;
	private String nomvetement;
	private Double prixvetement;
	private Date dateprod;
	

	@ManyToOne
	private Genre genre;
	
	public Vetement(String nomvetement, Double prixvetement, Date dateprod) {
		super();
		this.nomvetement = nomvetement;
		this.prixvetement = prixvetement;
		this.dateprod = dateprod;
	}
	public Vetement() {
		super();
	
	}
	public Long getIdvetement() {
		return idvetement;
	}
	public void setIdvetement(Long idvetement) {
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
	@Override
	public String toString() {
		return "Vetement [idvetement=" + idvetement + ", nomvetement=" + nomvetement + ", prixvetement=" + prixvetement
				+ ", dateprod=" + dateprod + "]";
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	

}
