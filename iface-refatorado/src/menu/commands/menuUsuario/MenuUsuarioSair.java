package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;
import menu.commands.MenuUsuario;

public class MenuUsuarioSair implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioSair(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.sair(iface);	
	}


}
