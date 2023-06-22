package maisoumenossaude;

import cargosEmpresa.CargosEmpresa;
import java.time.LocalDate;
import java.util.Scanner;

public class Usuarios {

    private static Adm adm;
    private static Gerente gerente;
    private static Atendente atendente;
    private static Vendedor vendedor;

    public static void inciarUsuarios() {
        adm = new Adm(new Credenciais("Adm123", "Administrador123456789"));
        BDados.getAdm().add(adm);
        /*gerente = new Gerente("Gerente", "GerenteCPF", "GerenteEndereco",
                "GerenteTelefone", "GerenteEmail", "GerenteNctps",
                0, LocalDate.now(), 0,
                new Credenciais("GerenteUsuario", "GerenteSenha"));
        vendedor = new Vendedor("Vendedor", "VendedorCPF",
                "VendedorEndereco", "VendedorTelefone",
                "VendedorEmail", "VendedorNctps", 0,
                LocalDate.now(), 0,
                new Credenciais("VendedorUsuario", "VendedorSenha"));
        atendente = new Atendente("Atendente", "AtendenteCPF",
                "AtendenteEndereco", "AtendenteTelefone",
                "AtendenteEmail", "AtendenteNctps", 0,
                LocalDate.now(), 0,
                new Credenciais("AtendenteUsuario", "AtendenteSenha"));*/
    }

    public static void fazerLogin() {
        Scanner sc = new Scanner(System.in);
        MenuAcao ma = new MenuAcao();
        String usuario = null;
        String senha = null;
        int opcao = 0;
        CargosEmpresa retorno = CargosEmpresa.valueOf("NADA");
        while (retorno == CargosEmpresa.valueOf("NADA")) {
            System.out.println("\nInforme o seu usuario: ");
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Senha: ");
            senha = sc.nextLine();
            retorno = verificarCredenciais(usuario, senha);
        }
        if (retorno == CargosEmpresa.ADMINISTRADOR) {
            do{
                Menu.acoesAdm(adm);
                opcao = sc.nextInt();
                opcao = ma.executarAcaoAdm(adm, opcao);
            } while(opcao != 0);
            
        } else if (retorno == CargosEmpresa.GERENTE){
            do{
                for(Gerente g: BDados.getGerentes()){
                    if(usuario.equals(g.getCredenciaisGerente().getUsuario()) && senha.equals(g.getCredenciaisGerente().getSenha())){   
                    Menu.acoesGerente(g);
                    opcao = sc.nextInt();
                    ma.executarAcaoGerente(g, opcao);
                    }
                }
            } while (opcao != 0);
            
        } else if (retorno == CargosEmpresa.VENDEDOR){
            do{
                for(Vendedor v: BDados.getVendedores()){
                    if (usuario.equals(v.getCredenciaisVendedor().getUsuario()) && senha.equals(v.getCredenciaisVendedor().getSenha())) {
                        Menu.acoesVendedor(v);
                        opcao = sc.nextInt();
                        ma.executarAcaoVendedor(v, opcao);
                    }
                }
            } while (opcao != 0);
            
        } else if (retorno == CargosEmpresa.ATENDENTE) {
            do{
                for(Atendente a: BDados.getAtendentes()){
                    if (usuario.equals(a.getCredenciaisAtendente().getUsuario()) && senha.equals(a.getCredenciaisAtendente().getSenha())) {
                        Menu.acoesAtendente(a);
                        opcao = sc.nextInt();
                        ma.executarAcaoAtendente(a, opcao);
                    }
                }
            } while (opcao != 0);
        }
    }

    public static CargosEmpresa verificarCredenciais(String usuario, String senha) {
        for(Adm administrador: BDados.getAdm()){
            if (usuario.equals(administrador.getCredenciaisAdm().getUsuario()) && senha.equals(administrador.getCredenciaisAdm().getSenha())) {
                return CargosEmpresa.ADMINISTRADOR;
            }
        }
        for(Gerente g: BDados.getGerentes()){
            if(usuario.equals(g.getCredenciaisGerente().getUsuario()) && senha.equals(g.getCredenciaisGerente().getSenha())){   
                return CargosEmpresa.GERENTE;
            }
        }
        
        for(Atendente a: BDados.getAtendentes()){
            if (usuario.equals(a.getCredenciaisAtendente().getUsuario()) && senha.equals(a.getCredenciaisAtendente().getSenha())) {
                return CargosEmpresa.ATENDENTE;
            }
        }
            
        for(Vendedor v: BDados.getVendedores()){
            if (usuario.equals(v.getCredenciaisVendedor().getUsuario()) && senha.equals(v.getCredenciaisVendedor().getSenha())) {
                return CargosEmpresa.VENDEDOR;
            }
        }
        return CargosEmpresa.valueOf("NADA");
    }
}
