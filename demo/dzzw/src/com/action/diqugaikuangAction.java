package com.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TDiqugaikuangDAO;
import com.model.TDiqugaikuang;
import com.opensymphony.xwork2.ActionSupport;

public class diqugaikuangAction extends ActionSupport
{

	private int  id;
	private String content;
	
	private String message;
	private String path;
	private TDiqugaikuangDAO diqugaikuangDAO;
	
	public String diqugaikuangMana()
	{
		TDiqugaikuang diqugaikuang=diqugaikuangDAO.findById(1);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("diqugaikuang", diqugaikuang);
		return ActionSupport.SUCCESS;
	}
	
	public String diqugaikuangEdit()
	{
		TDiqugaikuang diqugaikuang=diqugaikuangDAO.findById(1);
		diqugaikuang.setContent(content);
		diqugaikuangDAO.attachDirty(diqugaikuang);
		this.setMessage("²Ù×÷³É¹¦");
		this.setPath("diqugaikuangMana.action");
		return "succeed";
	}
	
	public String diqugaikuangAll()
	{
		TDiqugaikuang diqugaikuang=diqugaikuangDAO.findById(1);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("diqugaikuang", diqugaikuang);
		return ActionSupport.SUCCESS;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public TDiqugaikuangDAO getDiqugaikuangDAO()
	{
		return diqugaikuangDAO;
	}

	public void setDiqugaikuangDAO(TDiqugaikuangDAO diqugaikuangDAO)
	{
		this.diqugaikuangDAO = diqugaikuangDAO;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
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
	
}
