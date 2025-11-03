package com.chat.app.model;


public class ChatMessage 
{
 private Long id;
 private String sender;
 private String content;
 
 public ChatMessage() {
	super();
	// TODO Auto-generated constructor stub
}
 

 public ChatMessage(Long id, String sender, String content) {
	super();
	this.id = id;
	this.sender = sender;
	this.content = content;
}


 public Long getId() {
	return id;
 }
 
 public void setId(Long id) {
	this.id = id;
 }
 public String getSender() {
	return sender;
 }
 public void setSender(String sender) {
	this.sender = sender;
 }
 public String getContent() {
	return content;
 }
 public void setContent(String content) {
	this.content = content;
 }
 
}
