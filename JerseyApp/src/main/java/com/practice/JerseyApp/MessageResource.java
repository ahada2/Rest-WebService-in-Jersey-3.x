package com.practice.JerseyApp;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	List<Message> msg_list = new ArrayList<Message>();
	Message msg1 = new Message(1, "Hello", 2015);
	Message msg2 = new Message(2, "Good Morning", 2016);
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return msg_list;
	}*/
	
	@GET
	public Message getMessageByYear(@QueryParam("year") int year) {
		if(msg1.getYear() == year) {
			return msg1;
		}
		else if(msg2.getYear() == year){
			return msg2;
		}
		else {
			Message msg = new Message();
			return msg;
		}
	}
	
	@POST
	@Path("/add_message")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(Message message) {
		return "Message "+message.getId()+ " "+ message.getMessage();
	}
}
