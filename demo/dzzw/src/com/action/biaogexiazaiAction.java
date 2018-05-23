package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TBiaogexiazaiDAO;
import com.dao.TGonggaoDAO;
import com.dao.TPicNewsDAO;
import com.model.TBiaogexiazai;
import com.model.TPicNews;
import com.opensymphony.xwork2.ActionSupport;

public class biaogexiazaiAction extends ActionSupport
{
	private int id;
	private String name;
	private String jieshao;
	private String fujian;
	private String fujianYuanshiming;
	private String shangchuanshijian;
	
	private String message;
	private String path;
	private TBiaogexiazaiDAO biaogexiazaiDAO;
	
	public String biaogexiazaiAdd()
	{
		TBiaogexiazai biaogexiazai=new TBiaogexiazai();
		biaogexiazai.setName(name);
		biaogexiazai.setJieshao(jieshao);
		biaogexiazai.setFujian(fujian);
		biaogexiazai.setFujianYuanshiming(fujianYuanshiming);
		biaogexiazai.setShangchuanshijian(shangchuanshijian);
		biaogexiazai.setDel("no");
		biaogexiazaiDAO.save(biaogexiazai);
		this.setMessage("操作成功");
		this.setPath("biaogexiazaiMana.action");
		return "succeed";
	}
	
	
	public String biaogexiazaiMana()
	{
		String sql="from TBiaogexiazai where del='no'";
		List biaogexiazaiList =biaogexiazaiDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("biaogexiazaiList", biaogexiazaiList);
		return ActionSupport.SUCCESS;
	}
	
	public String biaogexiazaiAll()
	{
		String sql="from TBiaogexiazai where del='no'";
		List biaogexiazaiList =biaogexiazaiDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("biaogexiazaiList", biaogexiazaiList);
		return ActionSupport.SUCCESS;
	}
	
	public String biaogexiazaiDel()
	{
		String sql="update TBiaogexiazai set del='yes' where id="+id;
		biaogexiazaiDAO.getHibernateTemplate().bulkUpdate(sql);
		this.setMessage("操作成功");
		this.setPath("biaogexiazaiMana.action");
		return "succeed";
	}


	public TBiaogexiazaiDAO getBiaogexiazaiDAO()
	{
		return biaogexiazaiDAO;
	}


	public void setBiaogexiazaiDAO(TBiaogexiazaiDAO biaogexiazaiDAO)
	{
		this.biaogexiazaiDAO = biaogexiazaiDAO;
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


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getJieshao()
	{
		return jieshao;
	}


	public void setJieshao(String jieshao)
	{
		this.jieshao = jieshao;
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


	public String getShangchuanshijian()
	{
		return shangchuanshijian;
	}


	public void setShangchuanshijian(String shangchuanshijian)
	{
		this.shangchuanshijian = shangchuanshijian;
	}
	
}
