package iface;

import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	
	public int inicio() {
		System.out.printf("\n ======== iFace ========\n\n");
		System.out.println("- Digite a opcao desejada -");
		System.out.println("[1] Criar conta");
		System.out.println("[2] Entrar na sua conta");
		System.out.println("[0] Sair");
		return input.nextInt();
	}
	
	public int menuUsuario() {
		System.out.println("O que deseja fazer agora?");
		System.out.println("[1] Ver perfil");
		System.out.println("[2] Adicionar amigo");
		System.out.println("[3] Enviar mensagem a um amigo");
		System.out.println("[4] Criar comunidade");
		System.out.println("[5] Adicionar membro a uma comunidade");
		System.out.println("[6] Remover conta");
		System.out.println("[0] Sair do iFace");
		return input.nextInt();
	}
	
	
}
