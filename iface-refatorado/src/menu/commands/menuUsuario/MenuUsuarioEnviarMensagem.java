package menu.commands.menuUsuario;

import iface.IFace;
import menu.commands.Command;
import menu.commands.MenuUsuario;

public class MenuUsuarioEnviarMensagem implements Command{
	MenuUsuario menuUsuario;
	public MenuUsuarioEnviarMensagem(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	@Override
	public void execute(IFace iface) {
		menuUsuario.enviarMensagem(iface);	
	}


}
