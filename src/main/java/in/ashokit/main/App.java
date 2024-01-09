package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.AppConfig;
import in.ashokit.beans.Chip;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
                     Chip c =ctx.getBean(Chip.class);
                     System.out.println(c.chipType()); 
	}

}
