package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;
import menu.commands.MenuUsuario;

public class MenuUsuarioVerPerfil implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioVerPerfil(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.verPerfil(iface);	
	}


}
