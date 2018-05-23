package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.dao.TPicNewsDAO;
import com.model.TPicNews;
import com.opensymphony.xwork2.ActionSupport;

public class picNewsAction extends ActionSupport
{
	private int picNewsId;
	private String picNewsTitle;
	private String picNewsContent;
	private String fujian;
	private String fujianYuanshiming;
	
	private String message;
	private String path;
	private TPicNewsDAO picNewsDAO;
	private TGonggaoDAO gonggaoDAO;
	
	public String picNewsAdd()
	{
		TPicNews picNews=new TPicNews();
		picNews.setPicNewsTitle(picNewsTitle);
		picNews.setPicNewsContent(picNewsContent);
		picNews.setPicNewsDate(new Date().toLocaleString());
		picNews.setFujian(fujian);
		picNews.setFujianYuanshiming(fujianYuanshiming);
		picNewsDAO.save(picNews);
		this.setMessage("操作成功");
		this.setPath("picNewsMana.action");
		return "succeed";
	}
	
	
	public String picNewsMana()
	{
		List picNewsList =picNewsDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("picNewsList", picNewsList);
		return ActionSupport.SUCCESS;
	}
	
	public String picNewsDel()
	{
		TPicNews picNews=picNewsDAO.findById(picNewsId);
		picNewsDAO.delete(picNews);
		this.setMessage("操作成功");
		this.setPath("picNewsMana.action");
		return "succeed";
	}
	
	public String picNewsDetail()
	{
		TPicNews picNews=picNewsDAO.findById(picNewsId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("picNews", picNews);
		return ActionSupport.SUCCESS;
	}
	
	
	public String picNewsDetailQian()
	{
		TPicNews picNews=picNewsDAO.findById(picNewsId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("picNews", picNews);
		
		return ActionSupport.SUCCESS;
	}
	
	public String picNewsQian5()
	{
		Map request=(Map)ServletActionContext.getContext().get("request");
		List picNewsList=picNewsDAO.findAll();
		if(picNewsList.size()>5)
		{
			picNewsList=picNewsList.subList(0, 5);
		}
		request.put("picNewsList", picNewsList);
		
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public TPicNewsDAO getPicNewsDAO()
	{
		return picNewsDAO;
	}



	public void setPicNewsDAO(TPicNewsDAO picNewsDAO)
	{
		this.picNewsDAO = picNewsDAO;
	}



	public String getFujian()
	{
		return fujian;
	}


	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}


	public String getFujianYuanshiming()
	{
		return fujianYuanshiming;
	}


	public void setFujianYuanshiming(String fujianYuanshiming)
	{
		this.fujianYuanshiming = fujianYuanshiming;
	}


	public TGonggaoDAO getGonggaoDAO()
	{
		return gonggaoDAO;
	}


	public void setGonggaoDAO(TGonggaoDAO gonggaoDAO)
	{
		this.gonggaoDAO = gonggaoDAO;
	}


	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public String getPicNewsContent()
	{
		return picNewsContent;
	}
	public void setPicNewsContent(String picNewsContent)
	{
		this.picNewsContent = picNewsContent;
	}
	public int getPicNewsId()
	{
		return picNewsId;
	}
	public void setPicNewsId(int picNewsId)
	{
		this.picNewsId = picNewsId;
	}
	public String getPicNewsTitle()
	{
		return picNewsTitle;
	}
	public void setPicNewsTitle(String picNewsTitle)
	{
		this.picNewsTitle = picNewsTitle;
	}
	
}
