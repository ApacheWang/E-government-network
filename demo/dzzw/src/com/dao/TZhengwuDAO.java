package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TZhengwu;

/**
 * Data access object (DAO) for domain model class TZhengwu.
 * 
 * @see com.model.TZhengwu
 * @author MyEclipse Persistence Tools
 */

public class TZhengwuDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TZhengwuDAO.class);

	// property constants
	public static final String TITLE = "title";

	public static final String CONTENT = "content";

	public static final String SHIJIAN = "shijian";

	public static final String DEL = "del";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TZhengwu transientInstance)
	{
		log.debug("saving TZhengwu instance");
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

	public void delete(TZhengwu persistentInstance)
	{
		log.debug("deleting TZhengwu instance");
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

	public TZhengwu findById(java.lang.Integer id)
	{
		log.debug("getting TZhengwu instance with id: " + id);
		try
		{
			TZhengwu instance = (TZhengwu) getHibernateTemplate().get(
					"com.model.TZhengwu", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TZhengwu instance)
	{
		log.debug("finding TZhengwu instance by example");
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
		log.debug("finding TZhengwu instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TZhengwu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title)
	{
		return findByProperty(TITLE, title);
	}

	public List findByContent(Object content)
	{
		return findByProperty(CONTENT, content);
	}

	public List findByShijian(Object shijian)
	{
		return findByProperty(SHIJIAN, shijian);
	}

	public List findByDel(Object del)
	{
		return findByProperty(DEL, del);
	}

	public List findAll()
	{
		log.debug("finding all TZhengwu instances");
		try
		{
			String queryString = "from TZhengwu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TZhengwu merge(TZhengwu detachedInstance)
	{
		log.debug("merging TZhengwu instance");
		try
		{
			TZhengwu result = (TZhengwu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TZhengwu instance)
	{
		log.debug("attaching dirty TZhengwu instance");
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

	public void attachClean(TZhengwu instance)
	{
		log.debug("attaching clean TZhengwu instance");
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

	public static TZhengwuDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TZhengwuDAO) ctx.getBean("TZhengwuDAO");
	}
}