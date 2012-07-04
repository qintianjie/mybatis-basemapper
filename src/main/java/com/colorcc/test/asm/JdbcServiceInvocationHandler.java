package com.colorcc.test.asm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdbcServiceInvocationHandler implements InvocationHandler {
	
	private JdbcService jdbcService;
	
	public JdbcServiceInvocationHandler(JdbcService jdbcService) {
		this.jdbcService = jdbcService;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		Object invoke = method.invoke(jdbcService, args);
		
		return invoke;
	}

}
