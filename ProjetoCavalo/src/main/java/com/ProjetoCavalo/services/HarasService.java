package com.ProjetoCavalo.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.ProjetoCavalo.entities.Haras;
	import com.ProjetoCavalo.repository.HarasRepository;

	@Service
	public class HarasService {
		private final HarasRepository harasRepository;	
		
		@Autowired
		public HarasService(HarasRepository harasRepository) {
			 this.harasRepository = harasRepository;		
		}
		public Haras saveHaras(Haras haras) {
			return harasRepository.save(haras);
		}
		public Haras getHarasById(Long id) {
			return harasRepository.findById(id).orElse(null);

		}
		public List <Haras> getAllHaras() {
			return harasRepository.findAll();
		}
		public void deleteHaras(Long id) {
			harasRepository.deleteById(id);
		}

}
