
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Autor {
    String nome;
    String email;
    String cpf;

    public void mostrarDetalhes()
    { System.out.println
        ("##############################");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("cpf: " + cpf);
        System.out.println("##############################");
    }

        public Autor()
        {
            this.nome = " ";
            this.cpf = " ";
            this.email = " ";
        }

    public Autor(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        setCpf(cpf);
    }
    

    
//botão direito --> ações de código --> gerar get e set--> selecionar o que vc vai querer 

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        Pattern padrao1 = Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
        Matcher cpfPadrao = padrao1.matcher(cpf);

        Pattern padrao2 = Pattern.compile("[0-9]{11}");
        Matcher cpfpadrao2 = padrao2.matcher(cpf);
        if (cpfPadrao.find() || cpfpadrao2.find()) {
            System.out.println("CPF ACEITO");
            this.cpf = cpf;
        }
        else
        {
            System.err.println("CPF NÃO ACEITO");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() 
    {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


   
}
