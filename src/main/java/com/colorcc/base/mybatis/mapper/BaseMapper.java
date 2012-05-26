package com.colorcc.base.mybatis.mapper;

public interface BaseMapper<T> {
	
	public T selectOne(int id);
	
	public int deleteOne(int t);
	
	public int insertOne(T t);
	
	public int updateOne(T t);

}
