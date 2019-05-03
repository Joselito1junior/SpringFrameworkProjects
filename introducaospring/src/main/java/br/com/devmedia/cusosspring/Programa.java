package br.com.devmedia.cusosspring;

import br.com.devmedia.cusosspring.domain.Pessoa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Programa {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Programa.class);
		
		Pessoa pessoa = context.getBean(Pessoa.class);
		
		pessoa.setNome("Joselito");
		pessoa.setIdade(31);
		System.out.println(pessoa);
	}	
}
