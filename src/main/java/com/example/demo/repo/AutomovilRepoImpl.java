package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class AutomovilRepoImpl implements IAutomovilRepo {

	//punto de conexion con la base de datos
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
		
	}
	@Override
	public Automovil buscar(Integer placa) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Automovil.class, placa);
	}

}
