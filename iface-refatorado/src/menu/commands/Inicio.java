package menu.commands;

import java.util.Scanner;

import iface.IFace;
import iface.Usuario;
import iface.UsuarioStandard;

public class Inicio {
	Scanner entrada = new Scanner(System.in);
	
	public void login(IFace iface) {
		entrada = new Scanner(System.in);
		System.out.print("Digite o seu username: ");
		Usuario usuario = iface.retornarUsuario(entrada.nextLine());
		if(usuario == null) {
			System.out.println("Este username nao se refere a nenhum usuario do sistema");
		}
		else if(usuario.confirmarSenha()) {
			System.out.printf("Bem-vindo ao iFace, %s %s!\n", usuario.getNome(), usuario.getSobrenome()); 			
		}
		iface.setUsuarioLogado(usuario);		
	}
	
	public void cadastro(IFace iface) {
		System.out.println("Criando Conta");
		entrada.nextLine();
		System.out.println("Digite o nome do usuario:");
		String nome = entrada.nextLine();
		System.out.println("Digite o sobrenome do usuario:");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite o username do usuario:");
		String username = entrada.nextLine();
		System.out.println("Digite a senha do usuario:");
		String senha = entrada.nextLine();		
		iface.addUsuario(new UsuarioStandard(nome, sobrenome, username, senha));
		System.out.printf("Usuario criado com sucesso!\n\nSeja bem-vindo %s!", nome);
	}
	
	public void sair(IFace iface) {
		iface.setFuncionando(false);
	}
}
