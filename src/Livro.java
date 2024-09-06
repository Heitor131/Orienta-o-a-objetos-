public class Livro
{
    public String nome;
    public String descrição;
    public double valor;
    public String ISBN;
    private String isbn;
    private Autor autor;

    public void mostrarDetalhes()
    {
        System.out.println("---------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Descrição: "+ descrição);
        System.out.println("Valor: "+ valor);
        System.out.println("ISBN "+ ISBN);
        autor.mostrarDetalhes();
        System.out.println("---------------");
    }

    public Livro()
    {
        this.nome = " ";
        this.descrição = " ";
        this.valor = 0;
        this.ISBN = " ";
        this.autor = new Autor();
    }

    public Livro(String nome, String descricao, double valor, String isbn, Autor autor){
        this. nome = nome;
        this.descrição = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Livro(String nome, String descricao, double valor, String isbn, String nomeAutor, String emailAutor, String cpfAutor)
    {
        this. nome = nome;
        this.descrição = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = new Autor(nomeAutor, emailAutor, cpfAutor);
    }

    public boolean aplicarDesconto(float desconto){
        if(desconto <=30 && desconto > 0){
            this.valor -= (desconto/100)*this.valor;
            return true;
        }
        return false;
    }

    /**
     * 
     */
    
}
