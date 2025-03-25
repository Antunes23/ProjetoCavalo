package com.ProjetoCavalo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	
	@Entity
	@Table(name = "Cavalo")
	public class Cavalo {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome")
		private String nomes;
		
		@Column(name = "sexo")
		private String sexo;
		
		@Column(name = "cor")
		private String cor;
		
		@Column(name = "peso")
		private String peso;
		
		@Column(name = "preço")
		private String preço;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNomes() {
			return nomes;
		}

		public void setNomes(String nomes) {
			this.nomes = nomes;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getPeso() {
			return peso;
		}

		public void setPeso(String peso) {
			this.peso = peso;
		}

		public String getPreço() {
			return preço;
		}

		public void setPreço(String preço) {
			this.preço = preço;
		}
		
		

	}
