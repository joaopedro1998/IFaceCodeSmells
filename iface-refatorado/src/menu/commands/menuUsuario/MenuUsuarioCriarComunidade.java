package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;
import menu.commands.MenuUsuario;

public class MenuUsuarioCriarComunidade implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioCriarComunidade(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.criarComunidade(iface);	
	}


}
