package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TBiaogexiazai;

/**
 * Data access object (DAO) for domain model class TBiaogexiazai.
 * 
 * @see com.model.TBiaogexiazai
 * @author MyEclipse Persistence Tools
 */

public class TBiaogexiazaiDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TBiaogexiazaiDAO.class);

	// property constants
	public static final String NAME = "name";

	public static final String JIESHAO = "jieshao";

	public static final String FUJIAN = "fujian";

	public static final String FUJIAN_YUANSHIMING = "fujianYuanshiming";

	public static final String SHANGCHUANSHIJIAN = "shangchuanshijian";

	public static final String DEL = "del";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TBiaogexiazai transientInstance)
	{
		log.debug("saving TBiaogexiazai instance");
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

	public void delete(TBiaogexiazai persistentInstance)
	{
		log.debug("deleting TBiaogexiazai instance");
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

	public TBiaogexiazai findById(java.lang.Integer id)
	{
		log.debug("getting TBiaogexiazai instance with id: " + id);
		try
		{
			TBiaogexiazai instance = (TBiaogexiazai) getHibernateTemplate()
					.get("com.model.TBiaogexiazai", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBiaogexiazai instance)
	{
		log.debug("finding TBiaogexiazai instance by example");
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
		log.debug("finding TBiaogexiazai instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TBiaogexiazai as model where model."
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

	public List findByJieshao(Object jieshao)
	{
		return findByProperty(JIESHAO, jieshao);
	}

	public List findByFujian(Object fujian)
	{
		return findByProperty(FUJIAN, fujian);
	}

	public List findByFujianYuanshiming(Object fujianYuanshiming)
	{
		return findByProperty(FUJIAN_YUANSHIMING, fujianYuanshiming);
	}

	public List findByShangchuanshijian(Object shangchuanshijian)
	{
		return findByProperty(SHANGCHUANSHIJIAN, shangchuanshijian);
	}

	public List findByDel(Object del)
	{
		return findByProperty(DEL, del);
	}

	public List findAll()
	{
		log.debug("finding all TBiaogexiazai instances");
		try
		{
			String queryString = "from TBiaogexiazai";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBiaogexiazai merge(TBiaogexiazai detachedInstance)
	{
		log.debug("merging TBiaogexiazai instance");
		try
		{
			TBiaogexiazai result = (TBiaogexiazai) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBiaogexiazai instance)
	{
		log.debug("attaching dirty TBiaogexiazai instance");
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

	public void attachClean(TBiaogexiazai instance)
	{
		log.debug("attaching clean TBiaogexiazai instance");
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

	public static TBiaogexiazaiDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TBiaogexiazaiDAO) ctx.getBean("TBiaogexiazaiDAO");
	}
}