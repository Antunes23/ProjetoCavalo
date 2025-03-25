package com.ProjetoCavalo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	
	@Entity
	@Table(name = "Vendas")
	public class Vendas {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "quantidade")
		private String quantidade;
		
		@Column(name = "faturamento")
		private String faturamento;
		
		@Column(name = "lucro")
		private String lucro;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}

		public String getFaturamento() {
			return faturamento;
		}

		public void setFaturamento(String faturamento) {
			this.faturamento = faturamento;
		}

		public String getLucro() {
			return lucro;
		}

		public void setLucro(String lucro) {
			this.lucro = lucro;
		}
		
		
		

	}


