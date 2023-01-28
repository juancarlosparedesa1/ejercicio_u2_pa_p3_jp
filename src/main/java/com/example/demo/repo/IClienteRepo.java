package com.example.demo.repo;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {
	public void insertar(Cliente cliente );
	public Cliente buscar(String cedula);
}
