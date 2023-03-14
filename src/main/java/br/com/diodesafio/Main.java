package br.com.diodesafio;

import br.com.desafiodio.dominio.Conteudo;
import br.com.desafiodio.dominio.Curso;
import br.com.desafiodio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}
