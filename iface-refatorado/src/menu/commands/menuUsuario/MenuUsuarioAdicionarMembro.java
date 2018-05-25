package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;
import menu.commands.MenuUsuario;

public class MenuUsuarioAdicionarMembro implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioAdicionarMembro(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.adicionarMembro(iface);	
	}


}
