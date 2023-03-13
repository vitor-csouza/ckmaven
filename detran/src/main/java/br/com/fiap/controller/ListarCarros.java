package br.com.fiap.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.model.CarroModel;

@Controller
public class ListarCarros {
	
	@RequestMapping(value = {"/carros", "/"}, method = RequestMethod.GET)
	public String carros(Model model) {
		CarroModel carro1 = new CarroModel(1, "USU-2343", "Focus", 2022);
		CarroModel carro2 = new CarroModel(2, "ADS-8586", "Yaris", 2021);
		CarroModel carro3 = new CarroModel(3, "HDF-9767", "Corolla", 2020);
		
		ArrayList<CarroModel> listaCarros  = new ArrayList<CarroModel>();
		
		listaCarros.add(carro1);
		listaCarros.add(carro2);
		listaCarros.add(carro3);
		
		model.addAttribute("carros", listaCarros);
		return "carros";
	}
	

}