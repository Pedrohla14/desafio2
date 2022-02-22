package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo>conteudoInscritos=new LinkedHashSet<Conteudo>();
	private Set<Conteudo>conteudoConcluido=new LinkedHashSet<Conteudo>();

public void inscreverBootcamp(Bootcamp bootcamp) {
	this.conteudoInscritos.addAll(bootcamp.getConteudos());
	bootcamp.getDevsInscritos().add(this);
	
}

public void progedir() {
Optional<Conteudo>conteudo=this.conteudoInscritos.stream().findFirst();
if(conteudo.isPresent()) {
	this.conteudoConcluido.add(conteudo.get());
	this.conteudoInscritos.remove(conteudo.get());
}
else {
	System.out.println("Você não está matriculado em nenhum conteúdo");
}

}
public Double calcularTotalXp() {
return this.conteudoConcluido
		.stream()
		.mapToDouble(conteudo-> conteudo.calcularXp())
		.sum();
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Set<Conteudo> getConteudoInscrito() {
	return conteudoInscritos;
}

public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
	this.conteudoInscritos = conteudoInscrito;
}

public Set<Conteudo> getConteudoConcluido() {
	return conteudoConcluido;
}

public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
	this.conteudoConcluido = conteudoConcluido;
}

@Override
public int hashCode() {
	return Objects.hash(conteudoConcluido, conteudoInscritos, nome);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dev other = (Dev) obj;
	return Objects.equals(conteudoConcluido, other.conteudoConcluido)
			&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
}













}
