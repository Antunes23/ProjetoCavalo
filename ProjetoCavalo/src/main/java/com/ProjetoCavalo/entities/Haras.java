	package com.ProjetoCavalo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	
	@Entity
	@Table(name = "Haras")
	public class Haras {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "localização")
		private String localização;
		
		@Column(name = "celas")
		private String celas;
		
		@Column(name = "cavalos")
		private String cavalos;
		
		@Column(name = "nome")
		private String nome;
		
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLocalização() {
			return localização;
		}

		public void setLocalização(String localização) {
			this.localização = localização;
		}

		public String getCelas() {
			return celas;
		}

		public void setCelas(String celas) {
			this.celas = celas;
		}

		public String getCavalos() {
			return cavalos;
		}

		public void setCavalos(String cavalos) {
			this.cavalos = cavalos;
		}
		
		
		

	}
