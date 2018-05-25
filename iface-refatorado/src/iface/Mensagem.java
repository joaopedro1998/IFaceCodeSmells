package iface;

public class Mensagem extends Solicitacao{
	private String mensagem;

	public Mensagem(Usuario usuarioRemetente, Usuario usuarioDestinatario, String mensagem) {
		super(usuarioRemetente, usuarioDestinatario);
		this.mensagem = mensagem;
	}	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
