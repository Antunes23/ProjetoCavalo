package com.ProjetoCavalo.services;


	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.ProjetoCavalo.entities.Vendas;
	import com.ProjetoCavalo.repository.VendasRepository;

	@Service
	public class VendasService {
		private final VendasRepository vendasRepository;	
		
		@Autowired
		public VendasService(VendasRepository vendasRepository) {
			 this.vendasRepository = vendasRepository;		
		}
		public Vendas saveVendas(Vendas vendas) {
			return vendasRepository.save(vendas);
		}
		public Vendas getVendasById(Long id) {
			return vendasRepository.findById(id).orElse(null);

		}
		public List <Vendas> getAllVendas() {
			return vendasRepository.findAll();
		}
		public void deleteVendas(Long id) {
			vendasRepository.deleteById(id);
		}

}
