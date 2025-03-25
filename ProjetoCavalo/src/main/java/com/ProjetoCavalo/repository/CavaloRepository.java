package com.ProjetoCavalo.repository;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.ProjetoCavalo.entities.Cavalo;
	
	public interface CavaloRepository extends JpaRepository<Cavalo, Long>{

}
