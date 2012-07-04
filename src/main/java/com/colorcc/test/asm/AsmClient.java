package com.colorcc.test.asm;

import java.io.IOException;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;

public class AsmClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ClassVisitor cv = new JdbcClassVisitor();
		ClassReader cr = new ClassReader("com.colorcc.test.asm.JdbcService");
		cr.accept(cv, 0);
		
		

	}

}
