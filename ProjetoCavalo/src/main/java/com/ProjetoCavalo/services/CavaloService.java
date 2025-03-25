package com.ProjetoCavalo.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.ProjetoCavalo.entities.Cavalo;
	import com.ProjetoCavalo.repository.CavaloRepository;

	@Service
	public class CavaloService {
		private final CavaloRepository cavaloRepository;	
		
		@Autowired
		public CavaloService(CavaloRepository cavaloRepository) {
			 this.cavaloRepository = cavaloRepository;		
		}
		public Cavalo saveCavalo(Cavalo cavalo) {
			return cavaloRepository.save(cavalo);
		}
		public Cavalo getCavaloById(Long id) {
			return cavaloRepository.findById(id).orElse(null);

		}
		public List <Cavalo> getAllCavalo() {
			return cavaloRepository.findAll();
		}
		public void deleteCavalo(Long id) {
			cavaloRepository.deleteById(id);
		}

}
