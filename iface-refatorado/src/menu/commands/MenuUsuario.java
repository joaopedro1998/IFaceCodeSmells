package menu.commands;

import java.util.Scanner;

import iface.Comunidade;
import iface.IFace;
import iface.Mensagem;
import iface.NullUsuario;
import iface.Solicitacao;
import iface.Usuario;

public class MenuUsuario {
	Usuario usuario = new NullUsuario();
	Scanner entrada = new Scanner(System.in);
	
	public void verPerfil(IFace iface) {
		this.usuario = iface.getUsuarioLogado();
		boolean mostrarMensagens = usuario.mostrarConta();
		if(mostrarMensagens)
			usuario.mostrarMensagens(iface.getMensagens());
		System.out.println("Deseja editar algo em sua conta? [Y/N]");
		String editar = entrada.next().toUpperCase();
		if(editar.equals("Y")) {
			usuario.editarConta();
			System.out.println("Alteracao feita com sucesso!");
		}
		this.usuario = new NullUsuario();
	}
	
	public void adicionarAmigo(IFace iface) {
		this.usuario = iface.getUsuarioLogado();
		System.out.print("Digite o username do seu possivel amigo: ");
		String usernameAmigo = entrada.next().toUpperCase();
		Usuario usuarioAuxiliar = iface.retornarUsuario(usernameAmigo);
		if(usuarioAuxiliar.getClass() == NullUsuario.class) {
			System.out.println("Este username nao se refere a algum usuario do sistema");
		} else {
			Solicitacao solicitacaoNova = new Solicitacao(this.usuario,usuarioAuxiliar);
			this.usuario.adicionarSolicitacaoAmizade(solicitacaoNova);
		}
		this.usuario = new NullUsuario();
	}
	
	public void enviarMensagem(IFace iface) {
		this.usuario = iface.getUsuarioLogado();
		System.out.print("Digite o username do destinatario: ");
		String usernameDestinatario = entrada.next().toUpperCase();
		Usuario usuarioAuxiliar1 = iface.retornarUsuario(usernameDestinatario);
		
		if(usuarioAuxiliar1.getClass() == NullUsuario.class) 
			System.out.println("Username nao se refere a algum usuario do sistema");
		else {
			entrada.nextLine();
			System.out.println("Digite a mensagem: ");
			String mensagemNova = entrada.nextLine();
			Mensagem addMensagem = new Mensagem(this.usuario,usuarioAuxiliar1, mensagemNova);
			iface.getMensagens().add(addMensagem);
		}
		this.usuario = new NullUsuario();
		System.out.println();
	}
	
	public void criarComunidade(IFace iface) {
		this.usuario = iface.getUsuarioLogado();
		System.out.printf("Criando comunidade\n\n");
		entrada.nextLine();
		System.out.print("Nome: ");
		String nomeComunidade = entrada.nextLine();
		System.out.print("Descricao da Comunidade: ");
		String descricaoComunidade = entrada.nextLine();		
		Comunidade novaComunidade = new Comunidade(nomeComunidade,descricaoComunidade, this.usuario);
		iface.getComunidade().add(novaComunidade);
		this.usuario.adicionarComunidadeUsuario(novaComunidade);
		
	}
	
	public void adicionarMembro(IFace iface) {
		this.usuario = iface.getUsuarioLogado();
		System.out.printf("\nAdicionando membro a uma comunidade\n\n");
		entrada.nextLine();
		int indexComunidade = -1;
		System.out.print("Digite o nome da comunidade: ");
		String nomeComunidade = entrada.nextLine().toUpperCase();
		for(int i = 0; i < iface.getComunidade().size(); i++) {
			if(iface.getComunidade().get(i).getNome().equals(nomeComunidade))
				indexComunidade = i;
		}
		
		if(indexComunidade == -1)
			System.out.println("Este nome nao se refere a alguma comunidade do sistema");
		else if (!iface.getComunidade().get(indexComunidade).getResponsavel().equals(this.usuario)) {
			System.out.printf("Voce nao e o Responsavel por esta comunidade.\n"
					+ "Apenas o responsavel por adicionar membros\n");
		}
		else {
			System.out.print("Digite o username do membro: ");
			String usernameMembro = entrada.next().toUpperCase();
			Usuario usuarioAuxiliar2 = iface.retornarUsuario(usernameMembro);

			if(usuarioAuxiliar2.getClass() == NullUsuario.class) 
				System.out.println("Este username nao se refere a algum usuario do sistema ");
			else {
				iface.getComunidade().get(indexComunidade).adicionarMembro(this.usuario, usuarioAuxiliar2);
			}
			
		}
		this.usuario = new NullUsuario();
	}
	
	public void excluirConta(IFace iface) {
		this.usuario = iface.getUsuarioLogado();
		if(!this.usuario.confirmarSenha()) {
			System.out.println("Senha invalida!");
		} else {
			System.out.println("Voce tem certeza que deseja excluir sua conta? [Y/N]");
			String exclusao = entrada.next().toUpperCase();
			if(exclusao.equals("Y")) {
				iface.getUsuarios().remove(this.usuario);
				System.out.println("Usuario excluido!");
			}
		}
		iface.setUsuarioLogadoNull();
		this.usuario = new NullUsuario();
	}
	
	public void sair(IFace iface) {
		iface.setUsuarioLogadoNull();
	}
}
/*	

do {
	
		case 4:
			
		case 5:
			System.out.printf("\nAdicionando membro a uma comunidade\n\n");
			entrada.nextLine();
			int indexComunidade = -1;
			System.out.print("Digite o nome da comunidade: ");
			nomeComunidade = entrada.nextLine().toUpperCase();
			for(int i = 0; i < comunidades.size(); i++) {
				if(comunidades.get(i).getNome().equals(nomeComunidade))
					indexComunidade = i;
			}
			
			if(indexComunidade == -1)
				System.out.println("Este nome nao se refere a alguma comunidade do sistema");
			else if (!comunidades.get(indexComunidade).getResponsavel().equals(usuario)) {
				System.out.printf("Voce nao e o Responsavel por esta comunidade.\n"
						+ "Apenas o responsavel por adicionar membros\n");
			}
			else {
				System.out.print("Digite o username do membro: ");
				String usernameMembro = entrada.next().toUpperCase();
				Usuario usuarioAuxiliar2 = retornarUsuario(usuarios,usernameMembro);

				if(usuarioAuxiliar2 == null) 
					System.out.println("Este username nao se refere a algum usuario do sistema ");
				else {
					comunidades.get(indexComunidade).adicionarMembro(usuario, usuarioAuxiliar2);
				}
				
			}
			break;
		case 6:
			if(!usuario.confirmarSenha()) {
				System.out.println("Senha invalida!");
			} else {
				System.out.println("Voce tem certeza que deseja excluir sua conta? [Y/N]");
				String exclusao = entrada.next().toUpperCase();
				if(exclusao.equals("Y")) {
					usuarios.remove(usuario);
					System.out.println("Usuario excluido!");
				}
			}
			break;
		case 0: default:
			 break;
		
	}
	
	
} while(voltar != 0);

}
}
}

}


*/	
