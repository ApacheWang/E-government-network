package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TBianmindianhua;

/**
 * Data access object (DAO) for domain model class TBianmindianhua.
 * 
 * @see com.model.TBianmindianhua
 * @author MyEclipse Persistence Tools
 */

public class TBianmindianhuaDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TBianmindianhuaDAO.class);

	// property constants
	public static final String NAME = "name";

	public static final String DIANHUA = "dianhua";

	public static final String DEL = "del";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TBianmindianhua transientInstance)
	{
		log.debug("saving TBianmindianhua instance");
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

	public void delete(TBianmindianhua persistentInstance)
	{
		log.debug("deleting TBianmindianhua instance");
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

	public TBianmindianhua findById(java.lang.Integer id)
	{
		log.debug("getting TBianmindianhua instance with id: " + id);
		try
		{
			TBianmindianhua instance = (TBianmindianhua) getHibernateTemplate()
					.get("com.model.TBianmindianhua", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBianmindianhua instance)
	{
		log.debug("finding TBianmindianhua instance by example");
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
		log.debug("finding TBianmindianhua instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TBianmindianhua as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name)
	{
		return findByProperty(NAME, name);
	}

	public List findByDianhua(Object dianhua)
	{
		return findByProperty(DIANHUA, dianhua);
	}

	public List findByDel(Object del)
	{
		return findByProperty(DEL, del);
	}

	public List findAll()
	{
		log.debug("finding all TBianmindianhua instances");
		try
		{
			String queryString = "from TBianmindianhua where del='no'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBianmindianhua merge(TBianmindianhua detachedInstance)
	{
		log.debug("merging TBianmindianhua instance");
		try
		{
			TBianmindianhua result = (TBianmindianhua) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBianmindianhua instance)
	{
		log.debug("attaching dirty TBianmindianhua instance");
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

	public void attachClean(TBianmindianhua instance)
	{
		log.debug("attaching clean TBianmindianhua instance");
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

	public static TBianmindianhuaDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TBianmindianhuaDAO) ctx.getBean("TBianmindianhuaDAO");
	}
}