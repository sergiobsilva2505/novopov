package br.com.sbs.estacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sbs.estacionamento.entities.Veiculo;
import br.com.sbs.estacionamento.service.VeiculoService;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping
	public String lista(Model model) {
		List<Veiculo> lista = veiculoService.findAll();
		model.addAttribute("veiculos", lista);

		return "veiculos";

	}
	
	@GetMapping()
	public String showForm() {
		return "index";
	}

}
