package com.colorcc.test.asm;

import java.util.List;

public interface JdbcService {
	
	public void createConnection();
	
	public void openConnection(String[] args, int i, int id);
	
	public AsmClient closeConnection(List<String> list, AsmClient ac);
}
