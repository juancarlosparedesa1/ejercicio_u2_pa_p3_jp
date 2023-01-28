package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	public void insertar(Automovil automovil);
	public Automovil buscar(Integer placa);

}
