package com.boot.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.IStudentDao;
import com.boot.entity.StudentEntity;
import com.boot.vo.StudentRequest;

@Service
public class StudentService implements IStudentService{

	@Autowired
	IStudentDao istudentDao;
	
	@Override
	public void saveData(StudentRequest request) {
		try {
			StudentEntity entity = new StudentEntity();
			BeanUtils.copyProperties(entity, (StudentRequest) request);
			istudentDao.save(entity);
			//sessionFactory.getCurrentSession().persist(entity);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
