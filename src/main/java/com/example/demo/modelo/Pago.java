package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pago")
	@SequenceGenerator(name = "Seq_pago", sequenceName = "seq_pago", allocationSize = 1)
	@Column(name="pag_")
	private Integer id;

	@Column(name="pag_numero_tarjeta")
	private String numeroTarjeta;
	
	@Column(name="pag_valor")
	private BigDecimal valor;
	
	//getters and setters
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pago [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", valor=" + valor + ", renta=" + renta + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Renta getRenta() {
		return renta;
	}

	public void setRenta(Renta renta) {
		this.renta = renta;
	}

	@OneToOne
	private Renta renta;
	
}
