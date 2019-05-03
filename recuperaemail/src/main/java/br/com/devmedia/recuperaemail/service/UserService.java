package br.com.devmedia.recuperaemail.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.devmedia.recuperaemail.domain.Mailer;
import br.com.devmedia.recuperaemail.domain.User;

@Service
public class UserService {

	private User user;
	
	@Autowired
	private Mailer mailer;
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void lembrarSenhaPorEmail() {
		mailer.setDestinatario(user.getEmail());
		mailer.setMensagem("A senha do usuário " + user.getLogin() + " é: 123");
		mailer.enviaEmail();
	}
}
