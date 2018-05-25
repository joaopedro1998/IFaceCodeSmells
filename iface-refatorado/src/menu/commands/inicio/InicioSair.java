package menu.commands.inicio;

import iface.IFace;
import menu.commands.Command;
import menu.commands.Inicio;

public class InicioSair implements Command{
	Inicio inicio;
	public InicioSair(Inicio inicio) {
		this.inicio = inicio;
	}
	
	@Override
	public void execute(IFace iface) {
		inicio.sair(iface);	
	}

}
