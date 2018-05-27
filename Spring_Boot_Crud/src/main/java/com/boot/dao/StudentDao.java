package com.boot.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.boot.entity.StudentEntity;
import com.boot.vo.StudentRequest;

@Repository
public class StudentDao {

/*	@Override
	public void save(Object data) {
		StudentEntity entity = new StudentEntity();
		SessionFactory sessionFactory;
		try {
			BeanUtils.copyProperties(entity, (StudentRequest) data);
			//sessionFactory.getCurrentSession().persist(entity);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/



}
