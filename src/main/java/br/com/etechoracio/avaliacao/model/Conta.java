package br.com.etechoracio.avaliacao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.avaliacao.enums.Situacao;
import br.com.etechoracio.avaliacao.enums.Tipo;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name="conta")
public class Conta {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data")
	private Date data;
	
	@Column(name="situacao")
	private Situacao situacao;
	
	@Column(name="tipo")
	private Tipo tipo;

}
