package com.dao;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TPicNews;

/**
 * Data access object (DAO) for domain model class TPicNews.
 * 
 * @see com.model.TPicNews
 * @author MyEclipse Persistence Tools
 */

public class TPicNewsDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TPicNewsDAO.class);

	// property constants
	public static final String PIC_NEWS_TITLE = "picNewsTitle";

	public static final String PIC_NEWS_CONTENT = "picNewsContent";

	public static final String PIC_NEWS_DATE = "picNewsDate";

	public static final String PIC_NEWS_ONE1 = "picNewsOne1";

	public static final String PIC_NEWS_ONE2 = "picNewsOne2";

	public static final String PIC_NEWS_ONE3 = "picNewsOne3";

	public static final String PIC_NEWS_ONE4 = "picNewsOne4";

	public static final String PIC_NEWS_ONE7 = "picNewsOne7";

	public static final String PIC_NEWS_ONE8 = "picNewsOne8";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TPicNews transientInstance)
	{
		log.debug("saving TPicNews instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPicNews persistentInstance)
	{
		log.debug("deleting TPicNews instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPicNews findById(java.lang.Integer id)
	{
		log.debug("getting TPicNews instance with id: " + id);
		try
		{
			TPicNews instance = (TPicNews) getHibernateTemplate().get(
					"com.model.TPicNews", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPicNews instance)
	{
		log.debug("finding TPicNews instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TPicNews instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TPicNews as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPicNewsTitle(Object picNewsTitle)
	{
		return findByProperty(PIC_NEWS_TITLE, picNewsTitle);
	}

	public List findByPicNewsContent(Object picNewsContent)
	{
		return findByProperty(PIC_NEWS_CONTENT, picNewsContent);
	}

	public List findByPicNewsDate(Object picNewsDate)
	{
		return findByProperty(PIC_NEWS_DATE, picNewsDate);
	}

	public List findByPicNewsOne1(Object picNewsOne1)
	{
		return findByProperty(PIC_NEWS_ONE1, picNewsOne1);
	}

	public List findByPicNewsOne2(Object picNewsOne2)
	{
		return findByProperty(PIC_NEWS_ONE2, picNewsOne2);
	}

	public List findByPicNewsOne3(Object picNewsOne3)
	{
		return findByProperty(PIC_NEWS_ONE3, picNewsOne3);
	}

	public List findByPicNewsOne4(Object picNewsOne4)
	{
		return findByProperty(PIC_NEWS_ONE4, picNewsOne4);
	}

	public List findByPicNewsOne7(Object picNewsOne7)
	{
		return findByProperty(PIC_NEWS_ONE7, picNewsOne7);
	}

	public List findByPicNewsOne8(Object picNewsOne8)
	{
		return findByProperty(PIC_NEWS_ONE8, picNewsOne8);
	}

	public List findAll()
	{
		log.debug("finding all TPicNews instances");
		try
		{
			String queryString = "from TPicNews order by picNewsId desc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPicNews merge(TPicNews detachedInstance)
	{
		log.debug("merging TPicNews instance");
		try
		{
			TPicNews result = (TPicNews) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPicNews instance)
	{
		log.debug("attaching dirty TPicNews instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPicNews instance)
	{
		log.debug("attaching clean TPicNews instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPicNewsDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TPicNewsDAO) ctx.getBean("TPicNewsDAO");
	}
}