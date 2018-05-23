package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.dao.TLingdaoxinxiangDAO;
import com.model.TAdmin;
import com.model.TGonggao;
import com.model.TLingdaoxinxiang;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class lingdaoxinxiangAction extends ActionSupport
{
	private int id;
	private String name;
	private String url;
	
	private String message;
	private String path;
	
	private TLingdaoxinxiangDAO lingdaoxinxiangDAO;
	
	public String lingdaoxinxiangAdd()
	{
		TLingdaoxinxiang lingdaoxinxiang=new TLingdaoxinxiang();
		lingdaoxinxiang.setName(name);
		lingdaoxinxiang.setUrl(url);
		lingdaoxinxiang.setDel("no");
		lingdaoxinxiangDAO.save(lingdaoxinxiang);
		this.setMessage("操作成功");
		this.setPath("lingdaoxinxiangMana.action");
		return "succeed";
	}
	
	
	public String lingdaoxinxiangMana()
	{
		List lingdaoxinxiangList =lingdaoxinxiangDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("lingdaoxinxiangList", lingdaoxinxiangList);
		return ActionSupport.SUCCESS;
	}
	
	public String lingdaoxinxiangDel()
	{
		String sql="update TLingdaoxinxiang set del='yes' where id="+id;
		lingdaoxinxiangDAO.getHibernateTemplate().bulkUpdate(sql);
		this.setMessage("操作成功");
		this.setPath("lingdaoxinxiangMana.action");
		return "succeed";
	}

	public String lingdaoxinxiangAll()
	{
		List lingdaoxinxiangList =lingdaoxinxiangDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("lingdaoxinxiangList", lingdaoxinxiangList);
		return ActionSupport.SUCCESS;
	}


	public TLingdaoxinxiangDAO getLingdaoxinxiangDAO()
	{
		return lingdaoxinxiangDAO;
	}


	public void setLingdaoxinxiangDAO(TLingdaoxinxiangDAO lingdaoxinxiangDAO)
	{
		this.lingdaoxinxiangDAO = lingdaoxinxiangDAO;
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


	public String getUrl()
	{
		return url;
	}


	public void setUrl(String url)
	{
		this.url = url;
	}
	
}
