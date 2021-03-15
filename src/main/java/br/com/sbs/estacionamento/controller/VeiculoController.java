package br.com.sbs.estacionamento.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sbs.estacionamento.entities.Veiculo;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {
	
	@GetMapping
	public String lista(Model model) {
		List<Veiculo> lista = veiculoServiceImpl.findAll();
		model.addAttribute("veiculos", lista);

		return "veiculos";

	}
	
	@GetMapping()
	public String showForm() {
		return "index";
	}

}
