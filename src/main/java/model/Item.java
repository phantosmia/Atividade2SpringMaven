package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
	private Long id;
    
    @Column(name = "ITEM_NOME", length = 20)
    private String nome;
    
    @Column(name = "ITEM_TIPO", length = 20)
    private String tipo;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
