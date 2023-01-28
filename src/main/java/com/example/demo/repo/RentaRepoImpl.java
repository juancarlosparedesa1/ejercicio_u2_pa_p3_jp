package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class RentaRepoImpl implements IRentaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(String placa, String cedula, Integer numeroDias, String numeroTarjeta) {
		// TODO Auto-generated method stub
		//this.entityManager.persist(numeroTarjeta);
		//this.entityManager.persist();
	}

}
