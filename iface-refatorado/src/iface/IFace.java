package iface;

import java.util.ArrayList;

public class IFace {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Comunidade> comunidades = new ArrayList<Comunidade>();
	private ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
	private Usuario usuarioLogado = new NullUsuario();
	private boolean funcionando = true;

	
	public IFace() {
		Usuario nome1 = new UsuarioStandard("Karen", "Gomes", "karengomes", "kngs");
		Usuario nome2 = new UsuarioStandard("Joao", "Silva", "joaozinho", "silva123");
		usuarios.add(nome1);
		usuarios.add(nome2);
		Comunidade comunidade1 = new Comunidade("Alunos do IC", nome1);
		comunidades.add(comunidade1);		
		Mensagem mensagem1 = new Mensagem(nome1,nome2,"Top");
		mensagens.add(mensagem1);
	}
	
	public Usuario retornarUsuario(String usernameUsuario) {
		for(Usuario u: this.usuarios) {
			if(usernameUsuario.equals(u.getUsername())) 
				return u;	
		}
		
		return new NullUsuario();
	}

	public Usuario getUsuarioLogado() {
		return this.usuarioLogado;
	}

	public void addUsuario(Usuario u) {
		this.usuarios.add(u);
	}
		
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	
	public boolean getFuncionando() {
		return funcionando;
	}
	
	public ArrayList<Mensagem> getMensagens() {
		return this.mensagens;
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public ArrayList<Comunidade> getComunidade(){
		return this.comunidades;
	}
	
	public void setUsuarioLogadoNull() {
		this.usuarioLogado = new NullUsuario();
	}

}