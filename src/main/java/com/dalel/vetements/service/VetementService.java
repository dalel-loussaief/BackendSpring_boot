package com.dalel.vetements.service;
import java.util.List;

import com.dalel.vetements.dto.VetementDTO;
import com.dalel.vetements.entities.Genre;
import com.dalel.vetements.entities.Vetement;

public interface VetementService {
	VetementDTO saveVetement(VetementDTO v);
	VetementDTO getVetement(Long id);
	List<VetementDTO> getAllVetement();
	
	
	
	VetementDTO updateVetement(VetementDTO v);
	void deleteVetement(Vetement v);
	void deleteVetementById(Long id);
	
	
	List<Vetement> findByNomVetement(String nom);
	List<Vetement> findByNomVetementContains(String nom);
	List<Vetement> findByNomPrix (String nom, Double prix);
	List<Vetement> findByGenre (Genre genre);
	List<Vetement> findByGenreIdG(Long id);
	List<Vetement> findByOrderByNomvetementAsc();
	List<Vetement> trierVetementsNomsPrix();
	
	VetementDTO convertEntityToDto (Vetement vetement);
	Vetement convertDtoToEntity(VetementDTO vetementDto);
}
