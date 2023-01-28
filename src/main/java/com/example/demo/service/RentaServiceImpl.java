package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo iRentaRepo;
	@Override
	public void Realizar(String placa, String cedula, Integer numeroDias, String numeroTarjeta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(placa, cedula, numeroDias, numeroTarjeta);
	}

}
