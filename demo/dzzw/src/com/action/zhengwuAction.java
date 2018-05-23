package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.dao.TPicNewsDAO;
import com.dao.TZhengwuDAO;
import com.model.TPicNews;
import com.model.TZhengwu;
import com.opensymphony.xwork2.ActionSupport;

public class zhengwuAction extends ActionSupport
{
	private int id;
	private String title;
	private String content;
	private String shijian;
	
	private String message;
	private String path;
	private TZhengwuDAO zhengwuDAO;
	
	public String zhengwuAdd()
	{
		TZhengwu zhengwu=new TZhengwu();
		zhengwu.setTitle(title);
		zhengwu.setContent(content);
		zhengwu.setShijian(shijian);
		zhengwu.setDel("no");
		zhengwuDAO.save(zhengwu);
		this.setMessage("操作成功");
		this.setPath("zhengwuMana.action");
		return "succeed";
	}
	
	
	public String zhengwuMana()
	{
		String sql="from TZhengwu where del='no'";
		List zhengwuList =zhengwuDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("zhengwuList", zhengwuList);
		return ActionSupport.SUCCESS;
	}
	
	public String zhengwuDel()
	{
		
		String sql="update TZhengwu set del='yes' where id="+id;
		zhengwuDAO.getHibernateTemplate().bulkUpdate(sql);
		this.setMessage("操作成功");
		this.setPath("zhengwuMana.action");
		return "succeed";
	}
	
	public String zhengwuDetail()
	{
		TZhengwu zhengwu=zhengwuDAO.findById(id);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("zhengwu", zhengwu);
		return ActionSupport.SUCCESS;
	}
	
	
	public String zhengwuDetailQian()
	{
		TZhengwu zhengwu=zhengwuDAO.findById(id);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("zhengwu", zhengwu);
		
		return ActionSupport.SUCCESS;
	}
	
	public String zhengwuAll()
	{
		String sql="from TZhengwu where del='no'";
		List zhengwuList =zhengwuDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("zhengwuList", zhengwuList);
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


	public String getShijian()
	{
		return shijian;
	}


	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}


	public String getTitle()
	{
		return title;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	public TZhengwuDAO getZhengwuDAO()
	{
		return zhengwuDAO;
	}


	public void setZhengwuDAO(TZhengwuDAO zhengwuDAO)
	{
		this.zhengwuDAO = zhengwuDAO;
	}
	
}
