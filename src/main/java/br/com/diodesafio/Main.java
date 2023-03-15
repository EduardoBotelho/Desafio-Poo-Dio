package br.com.diodesafio;

import br.com.desafiodio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("descricao curso Javascript");
        curso2.setCargaHoraria(4);


        //Mentoria
        Mentoria  mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao da mentoria");
        mentoria.setData(LocalDate.now());


        //Polimorfismo
       // Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();
        // Conteudo nao pode ser instaciado por que e classe abstrata, mas pode se usar o objeto Curso ou Mentoria

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos" + devEduardo.getConteudosInscritos());

        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("----");
        System.out.println("Conteudos incritos" + devEduardo.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devEduardo.getConteudosConcluidos());
        System.out.println("XP" + devEduardo.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos incritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());


    }

}
