package br.com.sbs.estacionamento.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.sbs.estacionamento.entities.Veiculo;

// @Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {
	
}
