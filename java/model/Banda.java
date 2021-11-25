package model;

@Entity
@Table
public class Banda {
 
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="idbanda")
 protected int idbanda;
 
 @Column(name="nome")
 protected String nome;
 
 @Column(name="genero")
 protected String genero;
 
 
 
 public Banda() {
 }
 
 public Banda(String nome, String genero) {
  super();
  this.nome = nome;
  this.genero = genero;

 }

 public Banda(int idbanda, String nome, String genero) {
  super();
  this.idbanda = idbanda;
  this.nome = nome;
  this.genero = genero;
 
 }

public int getIdbanda() {
	return idbanda;
}

public void setIdbanda(int idbanda) {
	this.idbanda = idbanda;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}


}
