package menu.commands;

import iface.IFace;
import menu.commands.inicio.*;

public class InicioController implements CommandController{
	Inicio inicio = new Inicio();
	InicioCadastro inicioCadastro = new InicioCadastro(inicio);
	InicioSair inicioSair = new InicioSair(inicio);
	InicioLogin inicioLogin = new InicioLogin(inicio);
	
	Command slot;
	@Override
	public void setCommand(int commandOption) {
		// TODO Auto-generated method stub
		switch(commandOption) {
			case 0:
				slot = inicioSair;
				break;
			case 2:
				slot = inicioLogin;
				break;
			case 1:
				slot = inicioCadastro;
			default:
		}
	}

	@Override
	public void optionSelected(IFace iface) {
		// TODO Auto-generated method stub
		slot.execute(iface);
		
	}
	

}
