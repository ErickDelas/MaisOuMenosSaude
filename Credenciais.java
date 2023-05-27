package maisoumenossaude;

public class Credenciais {
    private String usuario;
    private String senha;
    
    public Credenciais (){}
    
    public Credenciais(String login, String senha){
        this.usuario = login;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
