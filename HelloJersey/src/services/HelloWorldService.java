package services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorldService {
	private static ArrayList<String> messages = new ArrayList<String>();
			
	@GET
	public String getMessages() {
		StringBuilder sb = new StringBuilder();
		sb.append("hello world\n");
		for (String msg: messages) {
			sb.append(msg).append("\n");
		}
		return sb.toString();		
	}
	
	@POST
	public void addMessage(String msg) {
		String[] arr=msg.split(" ");
		
		if(arr[0].toLowerCase().equals("worldrecord"))
		{
			
		}
		messages.add(msg);
	}
	
}
