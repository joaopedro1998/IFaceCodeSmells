package iface;

import java.util.ArrayList;

public interface Usuario {
	public String getNome();
	public void setNome(String nome);
	public String getSobrenome();
	public void setSobrenome(String sobrenome);
	public String getUsername();
	public void setUsername(String username);
	public String getSobre();
	public void setSobre(String sobre);
	public ArrayList<Usuario> getAmigos();
	public String getSenha();
	public void setSenha(String senha);
	public boolean confirmarSenha();
	public int getStatusRelacionamento();
	public String getStatusRelacionamentoTraduzido();
	public void setStatusRelacionamento(int statusRelacionamento);
	public int getGenero();
	public String getGeneroTraduzido();
	public void setGenero(int genero);
	public ArrayList<Comunidade> getComunidadesDoUsuario();
	public void adicionarComunidadeUsuario(Comunidade comunidadeDoUsuario);
	public void mostrarEAceitarSolicitacoesAmizade();
	public void adicionarSolicitacaoAmizade(Solicitacao solicitacaoAmizade);
	public void mostrarMensagens(ArrayList<Mensagem> mensagensTotal);
	public void setAmigos(ArrayList<Usuario> amigos);
	public void adicionarAmigo(Usuario amigo);
	public boolean mostrarConta();
	public void editarConta();
	
	

	
}
