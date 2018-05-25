package iface;

import java.util.ArrayList;

public class NullUsuario implements Usuario {
	public NullUsuario() {}
	
	public String getNome() {return null;}
	public void setNome(String nome) {}
	public String getSobrenome() {return null;}
	public void setSobrenome(String sobrenome) {}
	public String getUsername() {return null;}
	public void setUsername(String username) {}
	public String getSobre() {return null;}
	public void setSobre(String sobre) {}
	public ArrayList<Usuario> getAmigos() {return null;}
	
	public String getSenha() {return null;}
	public void setSenha(String senha) {}
	public boolean confirmarSenha() {return false;}

	public int getStatusRelacionamento() {return -1;}
	
	public String getStatusRelacionamentoTraduzido() {return null;}

	public void setStatusRelacionamento(int statusRelacionamento) {}

	public int getGenero() {return -1;}
	
	public String getGeneroTraduzido() {return null;}

	public void setGenero(int genero) {}

	public ArrayList<Comunidade> getComunidadesDoUsuario(){return null;}

	public void adicionarComunidadeUsuario(Comunidade comunidadeDoUsuario) {}

	public void mostrarEAceitarSolicitacoesAmizade() {}
	
	public void adicionarSolicitacaoAmizade(Solicitacao solicitacaoAmizade) {}
	
	public void mostrarMensagens(ArrayList<Mensagem> mensagensTotal) {}

	public void setAmigos(ArrayList<Usuario> amigos) {}

	public void adicionarAmigo(Usuario amigo) {}
	
	
	public boolean mostrarConta() {return false;}
	
	public void editarConta() {}
}
