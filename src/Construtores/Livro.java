package Construtores;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 50.0;
    }

    public Livro(String titulo , String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }


    public void exibirLivro(){
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Preço : " + preco);
    }

}
