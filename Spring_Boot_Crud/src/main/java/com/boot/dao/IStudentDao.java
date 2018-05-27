package com.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.StudentEntity;


@Repository
public interface IStudentDao extends CrudRepository<StudentEntity, Long> {
//public void save(Object data);
}
