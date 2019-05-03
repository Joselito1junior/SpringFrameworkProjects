package br.com.devmedia.recuperaemail.domain;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mailer {
	private String destinatario;
	
	@Value("contato@devmedia.com.br")
	private String remetente;
	
	@Value("Lembrete de senha DevMedia")
	private String titulo;
	
	private String mensagem;

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void enviaEmail() {
		System.out.println("*** E-mail enivado com sucesso! *** ");
		System.out.println("Titulo do e-mail: " + titulo);
		System.out.println("Remetente: " + remetente);
		System.out.println("Destinatário: " + destinatario);
		System.out.println("Mensagem: " + mensagem);
	}
}
