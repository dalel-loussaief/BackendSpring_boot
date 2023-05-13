package com.dalel.vetements.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dalel.vetements.dto.VetementDTO;
import com.dalel.vetements.entities.Genre;
import com.dalel.vetements.entities.Vetement;
import com.dalel.vetements.repos.VetementRepository;

@Service
public class VetementServiceImpl implements VetementService{

	@Autowired
	VetementRepository vetementRepository;
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public VetementDTO saveVetement(VetementDTO v) {
		
		return convertEntityToDto (vetementRepository.save(convertDtoToEntity(v)));
	}

	@Override
	public VetementDTO updateVetement(VetementDTO v) {
		return convertEntityToDto(vetementRepository.save(convertDtoToEntity(v)));
	}

	@Override
	public void deleteVetement(Vetement v) {
		vetementRepository.delete(v);		
	}

	@Override
	public void deleteVetementById(Long id) {
		vetementRepository.deleteById(id);		
	}

	@Override
	public VetementDTO getVetement(Long id) {
		return convertEntityToDto (vetementRepository.findById(id).get());
	}

	@Override
	public List<VetementDTO> getAllVetement() {
	
		return vetementRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public List<Vetement> findByNomVetement(String nom) {
		return vetementRepository.findByNomvetement(nom);
	}

	@Override
	public List<Vetement> findByNomVetementContains(String nom) {
		return vetementRepository.findByNomvetementContains(nom);
	}

	@Override
	public List<Vetement> findByNomPrix(String nom, Double prix) {
		return vetementRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Vetement> findByGenre(Genre genre) {
		return vetementRepository.findByGenre(genre);
	}

	@Override
	public List<Vetement> findByGenreIdG(Long id) {
	
		return vetementRepository.findByGenreIdG(id);
	}

	@Override
	public List<Vetement> findByOrderByNomvetementAsc() {
		return vetementRepository.findByOrderByNomvetementAsc();
	}

	@Override
	public List<Vetement> trierVetementsNomsPrix() {
		return vetementRepository.trierVetementNomsPrix();
	}

	@Override
	public VetementDTO convertEntityToDto(Vetement v) {
		
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		VetementDTO vetementDTO =modelMapper.map(v, VetementDTO.class);
		return vetementDTO;
		
		
		/*VetementDTO vetementDTO = new VetementDTO();
		vetementDTO.setIdvetement(v.getIdvetement());
		vetementDTO.setNomvetement(v.getNomvetement());
		vetementDTO.setPrixvetement(v.getPrixvetement());
		vetementDTO.setDateprod(v.getDateprod());
		//vetementDTO.setGenre(v.getGenre()); 
		vetementDTO.setNom(v.getGenre().getNom());
		return vetementDTO;*/
	/*	return VetementDTO.builder()
				.idvetement(v.getIdvetement())
				.nomvetement(v.getNomvetement())
				.prixvetement(v.getPrixvetement())
				.dateprod(v.getDateprod())
				.genre(v.getGenre())
				.build();
	}*/

}

	public Vetement convertDtoToEntity(VetementDTO vetementDto) {
		
		Vetement vetement = new Vetement();
		vetement=modelMapper.map(vetementDto, Vetement.class);
		
		return vetement;
		
		
		/*Vetement vetement = new Vetement();
		vetement.setIdvetement(vetementDto.getIdvetement());
		vetement.setNomvetement(vetementDto.getNomvetement());
		vetement.setPrixvetement(vetementDto.getPrixvetement());
		vetement.setDateprod(vetementDto.getDateprod());
		vetement.setGenre(vetementDto.getGenre());
		
		return vetement;*/
		
	}
}
