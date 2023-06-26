package com.cesar.ChatWeb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajes")
public class Mensaje {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long id_remitente;
	private long id_destinatario;
	private String contenido;
	private String fecha;
	
	
	public Mensaje() {
		super();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_remitente() {
		return id_remitente;
	}
	public void setId_remitente(long id_remitente) {
		this.id_remitente = id_remitente;
	}
	public long getId_destinatario() {
		return id_destinatario;
	}
	public void setId_destinatario(long id_destinatario) {
		this.id_destinatario = id_destinatario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

	
	
	
}

