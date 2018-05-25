package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;
import menu.commands.MenuUsuario;

public class MenuUsuarioExcluirConta implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioExcluirConta(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.excluirConta(iface);	
	}


}
