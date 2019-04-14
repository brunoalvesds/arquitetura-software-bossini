package br.usjt.weatherforecastspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.weatherforecastspringboot.model.PrevisaoTempo;
import br.usjt.weatherforecastspringboot.model.repository.PrevisaoTempoRepositoy;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private PrevisaoTempoRepositoy ptRep;
	
	@GetMapping("/previsao")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsao_tempo");
		List<PrevisaoTempo> previsoes = ptRep.findAll();
		mv.addObject("previsoes", previsoes);
		mv.addObject("previsao", new PrevisaoTempo());
		return mv;
	}
	
	@PostMapping("/previsao")
	public String adicionarPrevisao(PrevisaoTempo previsao) {
		ptRep.save(previsao);
		return "redirect:/previsao";
	}
}