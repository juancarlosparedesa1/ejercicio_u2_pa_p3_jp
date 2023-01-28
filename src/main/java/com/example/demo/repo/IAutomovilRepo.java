package com.example.demo.repo;

import com.example.demo.modelo.Automovil;

public interface IAutomovilRepo {
	public void insertar(Automovil automovil);
	public Automovil buscar(Integer placa);
}
