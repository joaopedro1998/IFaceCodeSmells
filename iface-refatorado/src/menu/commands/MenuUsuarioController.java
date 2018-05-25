package menu.commands;

import iface.IFace;
import menu.commands.menuUsuario.*;

public class MenuUsuarioController implements CommandController{
	Command slot;
	MenuUsuario menuUsuario = new MenuUsuario();
	MenuUsuarioVerPerfil menuUsuarioVerPerfil = new MenuUsuarioVerPerfil(menuUsuario);
	MenuUsuarioAdicionarAmigo menuUsuarioAdicionarAmigo = new MenuUsuarioAdicionarAmigo(menuUsuario);
	MenuUsuarioCriarComunidade menuUsuarioCriarComunidade = new MenuUsuarioCriarComunidade(menuUsuario);
	MenuUsuarioEnviarMensagem menuUsuarioEnviarMensagem = new MenuUsuarioEnviarMensagem(menuUsuario);
	MenuUsuarioExcluirConta menuUsuarioExcluirConta = new MenuUsuarioExcluirConta(menuUsuario);
	MenuUsuarioSair menuUsuarioSair = new MenuUsuarioSair(menuUsuario);
	MenuUsuarioAdicionarMembro menuUsuarioAdicionarMembro = new MenuUsuarioAdicionarMembro(menuUsuario);
	@Override
	public void setCommand(int commandOption) {
		// TODO Auto-generated method stub
		switch(commandOption) {
			case 1:
				slot = menuUsuarioVerPerfil;
				break;
			case 2:
				slot = menuUsuarioAdicionarAmigo;
				break;
			case 3:
				slot = menuUsuarioEnviarMensagem;
				break;
			case 4:
				slot = menuUsuarioCriarComunidade;
				break;
			case 5:
				slot = menuUsuarioAdicionarMembro;
				break;
			case 6:
				slot = menuUsuarioExcluirConta;
				break;
			case 0:
				slot = menuUsuarioSair;
				break;
			default:
				
		}
	}

	@Override
	public void optionSelected(IFace iface) {
		// TODO Auto-generated method stub
		slot.execute(iface);
	}

}
