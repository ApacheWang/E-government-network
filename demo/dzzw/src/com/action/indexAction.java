package com.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TDiqugaikuangDAO;
import com.model.TDiqugaikuang;
import com.opensymphony.xwork2.ActionSupport;

public class indexAction extends ActionSupport
{
	private TDiqugaikuangDAO diqugaikuangDAO;
	public TDiqugaikuangDAO getDiqugaikuangDAO()
	{
		return diqugaikuangDAO;
	}
	public void setDiqugaikuangDAO(TDiqugaikuangDAO diqugaikuangDAO)
	{
		this.diqugaikuangDAO = diqugaikuangDAO;
	}


	public String index()
	{
		TDiqugaikuang diqugaikuang=diqugaikuangDAO.findById(1);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("diqugaikuang", diqugaikuang);
		return ActionSupport.SUCCESS;
	}
}