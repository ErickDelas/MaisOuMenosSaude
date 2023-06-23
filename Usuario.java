package maisoumenossaude;

import cargosEmpresa.CargosEmpresa;
import cidades.Enum.Cidades;
import java.time.LocalDate;
import java.util.Scanner;

public class Usuarios {

    private static Adm adm;
    private static Gerente gerenteCF;
    private static Gerente gerenteI;
    private static Gerente gerenteT;
    private static Atendente atendente;
    private static Vendedor vendedor;

    public static void inciarUsuarios() {
        adm = new Adm(new Credenciais("Adm123", "Administrador123456789"));
        BDados.getAdm().add(adm);

        gerenteCF = new Gerente("g1", "g1", "g1", "g1",
                "g1", "g1", 10000, LocalDate.now(),
                100, new Credenciais("g1", "g1"));
        gerenteCF.setCidade(Cidades.CORONEL_FABRICIANO);
        BDados.getGerentes().add(gerenteCF);
        gerenteI = new Gerente("g2", "g2", "g2", "g2",
                "g2", "g2", 20000, LocalDate.now(),
                200, new Credenciais("g2", "g2"));
        gerenteI.setCidade(Cidades.IPATINGA);
        BDados.getGerentes().add(gerenteI);
        gerenteT = new Gerente("g3", "g3", "g3", "g3",
                "g3", "g3", 30000, LocalDate.now(),
                300, new Credenciais("g3", "g3"));
        gerenteT.setCidade(Cidades.TIMOTEO);
        BDados.getGerentes().add(gerenteT);

        for (int i = 1; i <= 3; i++) {
            int aux1 = 0;
            int aux2 = 0;
            atendente = new Atendente("a" + i, "a" + i, "a" + i, "a" + i, "a" + i, "a" + i,
                    1000 + aux2, LocalDate.now(), 100 + aux1,
                    new Credenciais("a" + i, "a" + i));
            atendente.setCidade(Cidades.CORONEL_FABRICIANO);
            BDados.getAtendentes().add(atendente);
            aux1 = 100;
            aux2 = 1000;
        }

        for (int i = 4; i <= 6; i++) {
            int aux1 = 0;
            int aux2 = 0;
            atendente = new Atendente("a" + i, "a" + i, "a" + i, "a" + i, "a" + i, "a" + i,
                    4000 + aux2, LocalDate.now(), 400 + aux1,
                    new Credenciais("a" + i, "a" + i));
            atendente.setCidade(Cidades.IPATINGA);
            BDados.getAtendentes().add(atendente);
            aux1 = 100;
            aux2 = 1000;
        }

        for (int i = 7; i <= 9; i++) {
            int aux1 = 0;
            int aux2 = 0;
            atendente = new Atendente("a" + i, "a" + i, "a" + i, "a" + i, "a" + i, "a" + i,
                    7000 + aux2, LocalDate.now(), 700 + aux1,
                    new Credenciais("a" + i, "a" + i));
            atendente.setCidade(Cidades.TIMOTEO);
            BDados.getAtendentes().add(atendente);
            aux1 = 100;
            aux2 = 1000;
        }

        for (int i = 1; i <= 3; i++) {
            int aux1 = 0;
            int aux2 = 0;
            vendedor = new Vendedor("v" + i, "v" + i, "v" + i, "v" + i, "v" + i, "v" + i,
                    1000 + aux2, LocalDate.now(), 100 + aux1,
                    new Credenciais("v" + i, "v" + i));
            vendedor.setCidade(Cidades.CORONEL_FABRICIANO);
            BDados.getVendedores().add(vendedor);
            aux1 = 100;
            aux2 = 1000;
        }

        for (int i = 4; i <= 6; i++) {
            int aux1 = 0;
            int aux2 = 0;
            vendedor = new Vendedor("v" + i, "v" + i, "v" + i, "v" + i, "v" + i, "v" + i,
                    4000 + aux2, LocalDate.now(), 400 + aux1,
                    new Credenciais("v" + i, "v" + i));
            vendedor.setCidade(Cidades.IPATINGA);
            BDados.getVendedores().add(vendedor);
            aux1 = 100;
            aux2 = 1000;
        }

        for (int i = 7; i <= 9; i++) {
            int aux1 = 0;
            int aux2 = 0;
            vendedor = new Vendedor("v" + i, "v" + i, "v" + i, "v" + i, "v" + i, "v" + i,
                    7000 + aux2, LocalDate.now(), 700 + aux1,
                    new Credenciais("v" + i, "v" + i));
            vendedor.setCidade(Cidades.TIMOTEO);
            BDados.getVendedores().add(vendedor);
            aux1 = 100;
            aux2 = 1000;
        }

        for (int i = 1; i <= 10; i++) {
            Cliente cliente = new Cliente("c" + i, "c" + i, "c" + i, "c" + i, "c" + i);
            BDados.getPossiveisClientes().add(cliente);
        }
        
        Plano p = new Plano("TotalSaude", 85.00);
        p.getEspecialidadesPlanos().add(new EspecialidadesP("Cardiologista", 10.0));
        p.getNomesClinicas().add(new NomesClinicas("Unimed"));
        BDados.getPlanos().add(p);
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
            do {
                Menu.acoesAdm(adm);
                opcao = sc.nextInt();
                opcao = ma.executarAcaoAdm(adm, opcao);
            } while (opcao != 0);

        } else if (retorno == CargosEmpresa.GERENTE) {
            do {
                for (Gerente g : BDados.getGerentes()) {
                    if (usuario.equals(g.getCredenciaisGerente().getUsuario()) && senha.equals(g.getCredenciaisGerente().getSenha())) {
                        Menu.acoesGerente(g);
                        opcao = sc.nextInt();
                        ma.executarAcaoGerente(g, opcao);
                    }
                }
            } while (opcao != 0);

        } else if (retorno == CargosEmpresa.VENDEDOR) {
            do {
                for (Vendedor v : BDados.getVendedores()) {
                    if (usuario.equals(v.getCredenciaisVendedor().getUsuario()) && senha.equals(v.getCredenciaisVendedor().getSenha())) {
                        Menu.acoesVendedor(v);
                        opcao = sc.nextInt();
                        ma.executarAcaoVendedor(v, opcao);
                    }
                }
            } while (opcao != 0);

        } else if (retorno == CargosEmpresa.ATENDENTE) {
            do {
                for (Atendente a : BDados.getAtendentes()) {
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
        for (Adm administrador : BDados.getAdm()) {
            if (usuario.equals(administrador.getCredenciaisAdm().getUsuario()) && senha.equals(administrador.getCredenciaisAdm().getSenha())) {
                return CargosEmpresa.ADMINISTRADOR;
            }
        }
        for (Gerente g : BDados.getGerentes()) {
            if (usuario.equals(g.getCredenciaisGerente().getUsuario()) && senha.equals(g.getCredenciaisGerente().getSenha())) {
                return CargosEmpresa.GERENTE;
            }
        }

        for (Atendente a : BDados.getAtendentes()) {
            if (usuario.equals(a.getCredenciaisAtendente().getUsuario()) && senha.equals(a.getCredenciaisAtendente().getSenha())) {
                return CargosEmpresa.ATENDENTE;
            }
        }

        for (Vendedor v : BDados.getVendedores()) {
            if (usuario.equals(v.getCredenciaisVendedor().getUsuario()) && senha.equals(v.getCredenciaisVendedor().getSenha())) {
                return CargosEmpresa.VENDEDOR;
            }
        }
        return CargosEmpresa.valueOf("NADA");
    }
}
