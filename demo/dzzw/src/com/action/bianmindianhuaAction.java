package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TBianmindianhuaDAO;
import com.dao.TGonggaoDAO;
import com.dao.TLingdaoxinxiangDAO;
import com.model.TAdmin;
import com.model.TBianmindianhua;
import com.model.TGonggao;
import com.model.TLingdaoxinxiang;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class bianmindianhuaAction extends ActionSupport
{
	private int id;
	private String name;
	private String dianhua;
	
	private String message;
	private String path;
	
	private TBianmindianhuaDAO bianmindianhuaDAO;
	
	public String bianmindianhuaAdd()
	{
		TBianmindianhua bianmindianhua=new TBianmindianhua();
		bianmindianhua.setName(name);
		bianmindianhua.setDianhua(dianhua);
		bianmindianhua.setDel("no");
		bianmindianhuaDAO.save(bianmindianhua);
		this.setMessage("操作成功");
		this.setPath("bianmindianhuaMana.action");
		return "succeed";
	}
	
	
	public String bianmindianhuaMana()
	{
		List bianmindianhuaList =bianmindianhuaDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("bianmindianhuaList", bianmindianhuaList);
		return ActionSupport.SUCCESS;
	}
	
	public String bianmindianhuaDel()
	{
		String sql="update TBianmindianhua set del='yes' where id="+id;
		bianmindianhuaDAO.getHibernateTemplate().bulkUpdate(sql);
		this.setMessage("操作成功");
		this.setPath("bianmindianhuaMana.action");
		return "succeed";
	}

	public String bianmindianhuaAll()
	{
		List bianmindianhuaList =bianmindianhuaDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("bianmindianhuaList", bianmindianhuaList);
		return ActionSupport.SUCCESS;
	}


	public TBianmindianhuaDAO getBianmindianhuaDAO()
	{
		return bianmindianhuaDAO;
	}


	public void setBianmindianhuaDAO(TBianmindianhuaDAO bianmindianhuaDAO)
	{
		this.bianmindianhuaDAO = bianmindianhuaDAO;
	}


	public String getDianhua()
	{
		return dianhua;
	}


	public void setDianhua(String dianhua)
	{
		this.dianhua = dianhua;
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


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
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
