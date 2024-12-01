package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // adicionar todos os conteudos do bootcamp ao dev
        bootcamp.getDevsInscritos().add(this); // adicionar o dev ao bootcamp
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // pega o primeiro conteudo
        if(conteudo.isPresent()) { //se tiver conteudo
            this.conteudosConcluidos.add(conteudo.get()); // adiciona o conteudo concluido
            this.conteudosInscritos.remove(conteudo.get()); // remove o conteudo inscrito do dev
        } else { // se não tiver conteudo
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
         /*Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator(); // iterator para percorrer os conteudos
        double soma = 0; // variavel para armazenar a soma dos xp
        while(iterator.hasNext()){ // enquanto tiver conteudo no iterator
            double next = iterator.next().calcularXp(); // pega o xp do conteudo e armazena na variavel next
            soma += next; // soma o xp do conteudo com a variavel soma
        }
        return soma; // retorna a soma dos xp dos conteudos concluidos */

        return this.conteudosConcluidos // pega os conteudos concluidos
                .stream() // transforma em stream para percorrer os conteudos concluidos do dev
                .mapToDouble(Conteudo::calcularXp) // pega o xp do conteudo e armazena na variavel next
                .sum(); // soma o xp do conteudo com a variavel soma
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
