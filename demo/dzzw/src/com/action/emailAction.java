package com.action;


import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.opensymphony.xwork2.ActionSupport;
import com.service.emailService;

public class emailAction extends ActionSupport
{
	private String toUrl;
	private String title;
	private String content;
	
	private String message;
	private String path;
	
	
	public String emailSend() throws AddressException, MessagingException
	{
		emailService.emailSend(toUrl, title, content);
		this.setMessage("²Ù×÷³É¹¦");
		this.setPath("lingdaoxinxiangAll.action");
		return "succeed";
	}


	public String getContent()
	{
		return content;
	}


	public void setContent(String content)
	{
		this.content = content;
	}


	public String getMessage()
	{
		return message;
	}


	public void setMessage(String message)
	{
		this.message = message;
	}


	public String getPath()
	{
		return path;
	}


	public void setPath(String path)
	{
		this.path = path;
	}


	public String getTitle()
	{
		return title;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	public String getToUrl()
	{
		return toUrl;
	}


	public void setToUrl(String toUrl)
	{
		this.toUrl = toUrl;
	}
	
	
	
}
