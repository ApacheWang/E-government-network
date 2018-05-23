package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TDiqugaikuang;

/**
 * Data access object (DAO) for domain model class TDiqugaikuang.
 * 
 * @see com.model.TDiqugaikuang
 * @author MyEclipse Persistence Tools
 */

public class TDiqugaikuangDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TDiqugaikuangDAO.class);

	// property constants
	public static final String CONTENT = "content";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TDiqugaikuang transientInstance)
	{
		log.debug("saving TDiqugaikuang instance");
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

	public void delete(TDiqugaikuang persistentInstance)
	{
		log.debug("deleting TDiqugaikuang instance");
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

	public TDiqugaikuang findById(java.lang.Integer id)
	{
		log.debug("getting TDiqugaikuang instance with id: " + id);
		try
		{
			TDiqugaikuang instance = (TDiqugaikuang) getHibernateTemplate()
					.get("com.model.TDiqugaikuang", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDiqugaikuang instance)
	{
		log.debug("finding TDiqugaikuang instance by example");
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
		log.debug("finding TDiqugaikuang instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TDiqugaikuang as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByContent(Object content)
	{
		return findByProperty(CONTENT, content);
	}

	public List findAll()
	{
		log.debug("finding all TDiqugaikuang instances");
		try
		{
			String queryString = "from TDiqugaikuang";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDiqugaikuang merge(TDiqugaikuang detachedInstance)
	{
		log.debug("merging TDiqugaikuang instance");
		try
		{
			TDiqugaikuang result = (TDiqugaikuang) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDiqugaikuang instance)
	{
		log.debug("attaching dirty TDiqugaikuang instance");
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

	public void attachClean(TDiqugaikuang instance)
	{
		log.debug("attaching clean TDiqugaikuang instance");
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

	public static TDiqugaikuangDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TDiqugaikuangDAO) ctx.getBean("TDiqugaikuangDAO");
	}
}