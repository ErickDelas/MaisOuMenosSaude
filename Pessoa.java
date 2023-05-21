package maisoumenossaudetest;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String nTelefone;
    private String email;
    
    public Pessoa (String nome, String cpf, String endereco, String nTelefone, 
        String email){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nTelefone = nTelefone;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return String.format("Nome = %s.%nCPF = %s.%nEndereço = %s."
            + "%nNumero de Celular = %s.%nEmail = %s.%n",this.nome,
            this.cpf, this.endereco, this.nTelefone, this.email);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getnTelefone() {
        return nTelefone;
    }

    public void setnTelefone(String nTelefone) {
        this.nTelefone = nTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
