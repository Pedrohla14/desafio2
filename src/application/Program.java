package application;

import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		Curso curso1= new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);

		
		Curso curso2= new Curso();
		
		curso2.setTitulo("curso javascript");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHoraria(4);
		
		
		
		
		Mentoria mentoria= new Mentoria();
		
		mentoria.setTitulo("mentoria java ");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
		

		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp= new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descri��o Bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devCamila= new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos "+ devCamila.getConteudoInscrito());
		System.out.println("========");
		devCamila.progedir();
		devCamila.progedir();
		System.out.println("========");
		System.out.println("Conte�dos Inscritos "+ devCamila.getConteudoInscrito());
		System.out.println("Conte�dos concluidos "+ devCamila.getConteudoConcluido());
		System.out.println("XP: "+devCamila.calcularTotalXp());
		
		System.out.println("========");
		
		Dev devJoao= new Dev();
		devCamila.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos "+ devJoao.getConteudoInscrito());
		System.out.println("========");
		devJoao.progedir();
		devJoao.progedir();
		devJoao.progedir();
		System.out.println("========");
		System.out.println("Conte�dos Inscritos "+ devJoao.getConteudoInscrito());
		System.out.println("Conte�dos concluidos "+ devJoao.getConteudoConcluido());
		System.out.println("XP: "+devJoao.calcularTotalXp());
	}

}
