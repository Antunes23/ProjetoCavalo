package com.ProjetoCavalo.services;


	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.ProjetoCavalo.entities.ApostaDeCorrida;
	import com.ProjetoCavalo.repository.ApostaDeCorridaRepository;

	@Service
	public class ApostaDeCorridaService {
		private final ApostaDeCorridaRepository apostaDeCorridaRepository;	
		
		@Autowired
		public ApostaDeCorridaService(ApostaDeCorridaRepository apostaDeCorridaRepository) {
			 this.apostaDeCorridaRepository = apostaDeCorridaRepository;		
		}
		public ApostaDeCorrida saveApostaDeCorrida(ApostaDeCorrida apostaDeCorrida) {
			return apostaDeCorridaRepository.save(apostaDeCorrida);
		}
		public ApostaDeCorrida getApostaDeCorridaById(Long id) {
			return apostaDeCorridaRepository.findById(id).orElse(null);

		}
		public List <ApostaDeCorrida> getAllApostaDeCorrida() {
			return apostaDeCorridaRepository.findAll();
		}
		public void deleteApostaDeCorrida(Long id) {
			apostaDeCorridaRepository.deleteById(id);
		}

}
