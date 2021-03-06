package br.usjt.weatherforecastspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.weatherforecastspringboot.model.PrevisaoTempo;
import br.usjt.weatherforecastspringboot.service.PrevisaoTempoService;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private PrevisaoTempoService service;
	
	@GetMapping("/previsao")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsao_tempo");
		List<PrevisaoTempo> previsoes = service.listarPrevisoes();
		mv.addObject("previsoes", previsoes);
		mv.addObject("previsao", new PrevisaoTempo());
//		Desta forma não funcionou para mim, mas no LoginController sim
//		mv.addObject(new PrevisaoTempo());
		return mv;
	}
	
	@PostMapping("/previsao")
	public String adicionarPrevisao(PrevisaoTempo previsao) {
		service.salvar(previsao);
		return "redirect:/previsao";
	}
}