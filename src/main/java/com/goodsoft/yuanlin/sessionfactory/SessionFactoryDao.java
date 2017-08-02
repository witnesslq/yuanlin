package com.goodsoft.yuanlin.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * function hibernate session工厂公共类
 * 
 * date 2017.02.28
 * 
 * @author 严彬荣
 */
@Repository
public class SessionFactoryDao {

	@Resource
	private SessionFactory factroy;

	public Session getSessionfactroy() {
		return this.factroy.getCurrentSession();
	}

}
