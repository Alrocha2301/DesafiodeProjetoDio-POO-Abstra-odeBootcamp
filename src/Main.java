import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descriçao curso de javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Programação Orientada a Objeto");
        mentoria1.setDescricao("Descrição POO");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        System.out.println(" - ");
        System.out.println("Conteudos Inscritos: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        System.out.println(" - ");
        devAlexandre.progredir();
        System.out.println(" - ");
        System.out.println("Conteudos Inscritos: " + devAlexandre.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devAlexandre.getConteudosConcluidos());
        System.out.println("XP: " + devAlexandre.calcularTotalXp());

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devAline.getConteudosInscritos());
        devAline.progredir();
        System.out.println(" - ");
        System.out.println("Conteudos Inscritos: " + devAline.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devAline.getConteudosConcluidos());
        System.out.println("XP: " + devAline.calcularTotalXp());

    }

}
