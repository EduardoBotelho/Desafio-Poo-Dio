package br.com.desafiodio.dominio;

public abstract class Conteudo {
    //classe abstrata nao pode ser instanciada(implementada)

    //constante
   protected static final double XP_PADRAO = 10d;

   private String titulo;
   private String descricao;

   public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
