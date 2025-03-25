package com.ProjetoCavalo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	
	@Entity
	@Table(name = "ApostaDeCorrida")
	public class ApostaDeCorrida {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "Cavalo")
		private String cavalo;
		
		@Column(name = "valor")
		private String valor;
		
		@Column(name = "odd")
		private String odd;
		
		@Column(name = "status")
		private String status;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCavalo() {
			return cavalo;
		}

		public void setCavalo(String cavalo) {
			this.cavalo = cavalo;
		}

		public String getValor() {
			return valor;
		}

		public void setValor(String valor) {
			this.valor = valor;
		}

		public String getOdd() {
			return odd;
		}

		public void setOdd(String odd) {
			this.odd = odd;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
		
		

	}


