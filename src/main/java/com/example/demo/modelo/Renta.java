package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_renta")
	@SequenceGenerator(name = "Seq_renta", sequenceName = "seq_renta", allocationSize = 1)
	@Column(name = "rent_id")
	private Integer id;

	@Column(name = "rent_fecha")
	private LocalDateTime fecha;

	@Column(name = "rent_numero_Dias")
	private Integer numeroDias;

	@Column(name = "rent_valor")
	private BigDecimal valor;

	@OneToOne
	private Pago pago;
	
	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valor=" + valor + ", pago="
				+ pago + ", miListaAutomoviles=" + miListaAutomoviles + ", miListaClientes=" + miListaClientes + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Integer getNumeroDias() {
		return numeroDias;
	}
	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Pago getPago() {
		return pago;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
	public List<Automovil> getMiListaAutomoviles() {
		return miListaAutomoviles;
	}
	public void setMiListaAutomoviles(List<Automovil> miListaAutomoviles) {
		this.miListaAutomoviles = miListaAutomoviles;
	}
	public List<Automovil> getMiListaClientes() {
		return miListaClientes;
	}
	public void setMiListaClientes(List<Automovil> miListaClientes) {
		this.miListaClientes = miListaClientes;
	}
	@OneToMany(mappedBy = "renta")
	
	List<Automovil> miListaAutomoviles;
	List<Automovil> miListaClientes;
	

	

}
