package iface;

import menu.commands.InicioController;
import menu.commands.MenuUsuarioController;

public class Main {

	public static void main(String[] args) {
		IFace iface = new IFace();
		int opcao;
		InicioController inicioController = new InicioController();
		MenuUsuarioController menuUsuarioController = new MenuUsuarioController();
		Menu menu = new Menu();

		
		while(iface.getFuncionando()) {
			if(iface.getUsuarioLogado().getClass() == NullUsuario.class) {
				opcao = menu.inicio();
				inicioController.setCommand(opcao);
				inicioController.optionSelected(iface);
			}else {
				opcao = menu.menuUsuario();
				menuUsuarioController.setCommand(opcao);
				menuUsuarioController.optionSelected(iface);
			}
		}
		
		System.out.println("Hasta La Vista, Baby!");
	}

}
