package menu.commands.inicio;

import iface.IFace;
import menu.commands.Command;
import menu.commands.Inicio;

public class InicioCadastro implements Command{
	Inicio inicio;
	public InicioCadastro(Inicio inicio) {
		this.inicio = inicio;
	}
	
	@Override
	public void execute(IFace iface) {
		inicio.cadastro(iface);	
	}

}
