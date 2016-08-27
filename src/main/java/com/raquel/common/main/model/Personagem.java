package com.raquel.common.main.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "PERSONAGEM")
public class Personagem {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PERSONAGEM_ID")
	private Long id;
    @Column(name = "NOME_PERSONAGEM",length=20)
    private String nome;
    @Column(name = "CLASSE_PERSONAGEM",length=20)
    private String classe;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "INVENTARIO", 
    	joinColumns = { @JoinColumn(name = "PERSONAGEM_ID") }, 
    	inverseJoinColumns = { @JoinColumn(name = "ITEM_ID") })
    private List<Item> itens;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
}
