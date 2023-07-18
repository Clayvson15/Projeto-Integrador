package PJP2023.Projeto.integrador.Models;

public class Marcas {

    public Marcas(String nome) {
        this.nome = nome;
    }

    private String nome;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Marcas() {
    }

    public Marcas(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
