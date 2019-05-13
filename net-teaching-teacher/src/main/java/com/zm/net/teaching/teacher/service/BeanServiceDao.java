package com.zm.net.teaching.teacher.service;

import java.util.List;

/**
 * 
 * 进行service的通用方法书写<br/>
 * 在实现的时候进行规定泛型
 * 
 * @author Administrator
 *
 * @param <T>
 */

public interface BeanServiceDao<T> {
	List<T> allEntity(int pageNum, int pageSize, T entity);

	int updEntity(T entity);

	int delEntity(Integer id);

}
