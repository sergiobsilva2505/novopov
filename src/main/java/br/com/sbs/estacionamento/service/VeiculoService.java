package br.com.sbs.estacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sbs.estacionamento.entities.Veiculo;
import br.com.sbs.estacionamento.repository.VeiculoRepository;

@Service
public class VeiculoService  {	
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public List<Veiculo> findAll() {
		List<Veiculo> list = veiculoRepository.findAll();
		return list;
	}

}
