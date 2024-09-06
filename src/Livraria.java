public class Livraria{
    public static void main(String[] args){
        
        Autor autor1 = new Autor("Robert Martin", "robert_martin@gmail.com", "123,4456,7789-0");
        Livro livro1 = new Livro("Arte da Guerra", "Livro filosofia e táticas de guerra", 50.5, "12-123-12345-12-1", autor1);
        livro1.mostrarDetalhes();

        //construtor parametrizado
        Autor autor2 = new Autor("George", "Georg@gmail.com", "123.456.789-00");
        Livro livro2 = new Livro("Arte da Guerra", "Livro filosofia e táticas de guerra", 50.5, "12-123-12345-12-1", autor2);
        
        livro2.mostrarDetalhes();
    }

}
