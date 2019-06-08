package br.com.etechoracio.avaliacao.business;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.ContaDAO;
import br.com.etechoracio.avaliacao.model.Conta;
import br.com.etechoracio.common.business.BaseSB;

public class ContaSB extends BaseSB {
	
	private ContaDAO contaDAO;

	@Override
	protected void postConstructImpl() {
		contaDAO = getDAO(ContaDAO.class);
	}
	
	public List<Conta> findAll() {
		return contaDAO.findAll();
	}
	
	

}
