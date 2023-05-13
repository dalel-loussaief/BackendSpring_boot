package com.dalel.vetements;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dalel.vetements.entities.Genre;
import com.dalel.vetements.entities.Vetement;
import com.dalel.vetements.repos.VetementRepository;


@SpringBootTest
class VetementsdemoApplicationTests {

	@Autowired
	private VetementRepository vetementRepository;
	

	@Test
	public void testCreateVetement() {
		Vetement v = new Vetement("pull",90.900,new Date());
		 vetementRepository.save(v);
	}
	@Test
	public void testFindVetement()
	{
		Vetement v = vetementRepository.findById(1L).get(); 
		System.out.println(v);
	}
	@Test
	public void testUpdateVetement()
	{
		Vetement v = vetementRepository.findById(1L).get(); 
		v.setPrixvetement(100.0);
		vetementRepository.save(v);
	}
	@Test
	public void testDeleteVetement()
	{
		vetementRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousVetement()
	{
	List<Vetement> vet = vetementRepository.findAll();
	for (Vetement v : vet)
	{
	System.out.println(v);
	}
	}
	@Test
	public void testFindVetementByNom()
	{
	List<Vetement> v = vetementRepository.findByNomvetement("robe"); 
	for (Vetement vet : v)
	{
	System.out.println(v);
	} 
	}
	@Test
	public void testFindVetementByNomContains()
	{
	List	<Vetement> v = vetementRepository.findByNomvetementContains("r");
	for (Vetement vet : v)
	{
	System.out.println(v);
	} 
	
}
	@Test
	public void testfindByNomPrix()
	{
	List<Vetement> vet = vetementRepository.findByNomPrix("robe", 300.900);
	for (Vetement v : vet)
	{
	System.out.println(v);
	}
}
	@Test
	public void testfindByGenre()
	{
		Genre cat = new Genre();
		cat.setIdG(1L);
		List<Vetement> prods = vetementRepository.findByGenre(cat);
		for (Vetement p : prods){
			System.out.println(p);
	}
	}
	@Test
	public void findByGenreIdG()
	{
	List<Vetement> vet =  vetementRepository.findByGenreIdG(1L);
	for (Vetement v : vet)
	{
	System.out.println(v);
	}
	 }
	@Test
	public void testfindByOrderByNomvetementAsc()
	{
	List<Vetement> vet = vetementRepository.findByOrderByNomvetementAsc();
	for (Vetement v : vet)
	{
	System.out.println(v);
	}
	}
	@Test
	public void  trierVetementNomsPrix()
	{
	List<Vetement> prods =vetementRepository.trierVetementNomsPrix();
	for (Vetement p : prods)
	{
	System.out.println(p);
	}
	}
	}