package br.com.devmedia.recuperaemail.application;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.devmedia.recuperaemail.domain.User;
import br.com.devmedia.recuperaemail.service.UserService;

@Configuration
@ComponentScan("br.com.devmedia.recuperaemail")
public class Programa {
	
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		
		User user = new User("Joselito", "joselito@joselito.com.br", "JoselitoADM");
		
		System.out.println("Deseja recuperar a senha (S/N)? ");
		String resposta = lerDados.nextLine();
		
		if(resposta.equalsIgnoreCase("S")) {
			ApplicationContext context = new AnnotationConfigApplicationContext(Programa.class);
			UserService userService = context.getBean(UserService.class);
			
			userService.setUser(user);
			userService.lembrarSenhaPorEmail();
		}
	}

}
