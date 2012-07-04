package com.colorcc.test.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class JdbcClassVisitor extends ClassVisitor {

	public JdbcClassVisitor() {
		super(Opcodes.ASM4);
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		System.out.println("Visit interface [" + name + "]");
	}
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
		
		System.out.println("Visit interface [" + name + "] " + desc);
		
		
		return super.visitMethod(access, name, desc, signature, exceptions);
	}

}
