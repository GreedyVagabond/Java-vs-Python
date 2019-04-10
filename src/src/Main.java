package src;


import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {

	public static void main(String args[]) throws Exception{
		System.out.println("Java vs Python");
		JDA jda = new JDABuilder(AccountType.BOT).setToken("NTY1MDE4NDMzMjAxMzczMjE1.XK1Qzg.QnN97RMGr0XayGrnQkXmaYQ2X6U").build();
		
		jda.addEventListener(new Test());
		
			
	}

}
