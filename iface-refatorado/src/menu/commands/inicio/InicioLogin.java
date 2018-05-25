package menu.commands.inicio;

import iface.IFace;
import menu.commands.Command;
import menu.commands.Inicio;

public class InicioLogin implements Command{
	Inicio inicio;
	public InicioLogin(Inicio inicio) {
		this.inicio = inicio;
	}
	@Override
	public void execute(IFace iface) {
		inicio.login(iface);	
	}

}
