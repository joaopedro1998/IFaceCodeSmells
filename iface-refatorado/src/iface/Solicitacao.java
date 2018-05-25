package iface;

public class Solicitacao {
	private Usuario usuarioRemetente;
	private Usuario usuarioDestinatario;
	
	
	public Solicitacao(Usuario usuarioRemetente, Usuario usuarioDestinatario) {
		this.usuarioRemetente = usuarioRemetente;
		this.usuarioDestinatario = usuarioDestinatario;
	}
	
	public Usuario getUsuarioRemetente() {
		return usuarioRemetente;
	}
	public void setUsuarioRemetente(Usuario usuarioRemetente) {
		this.usuarioRemetente = usuarioRemetente;
	}
	public Usuario getUsuarioDestinatario() {
		return usuarioDestinatario;
	}
	public void setUsuarioDestinatario(Usuario usuarioDestinatario) {
		this.usuarioDestinatario = usuarioDestinatario;
	}
	
}
