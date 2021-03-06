package br.usjt.weatherforecastspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.weatherforecastspringboot.model.PrevisaoTempo;
import br.usjt.weatherforecastspringboot.model.repository.PrevisaoTempoRepositoy;

@Service
public class PrevisaoTempoService {
	
	@Autowired
	private PrevisaoTempoRepositoy repo;
	
	public List<PrevisaoTempo> listarPrevisoes() {
		List<PrevisaoTempo> previsoes = repo.findAll();
		return previsoes;
	}
	
	public void salvar(PrevisaoTempo previsao) {
		repo.save(previsao);
	}
}