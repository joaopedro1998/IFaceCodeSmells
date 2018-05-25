package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;

import menu.commands.MenuUsuario;

public class MenuUsuarioAdicionarAmigo implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioAdicionarAmigo(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.adicionarAmigo(iface);	
	}


}
