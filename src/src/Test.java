package src;


import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Test extends ListenerAdapter {
	
	//to store the last message, user, channel, etc.
	private GuildMessageReceivedEvent theLastMessage;

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

		theLastMessage = e;
		String message = e.getMessage().getContentRaw();

		if (e.getAuthor().isBot())
			return;

		if(message.equals("!ping")) {
			sendMessage("pong!");
		}
	}
	
	
	
	
	//Other stuff

	public void sendMessage(String m) {
		theLastMessage.getChannel().sendMessage(m).queue();
	}
	

}
