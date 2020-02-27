package com.ilinks.practice.java.immutable;

import java.lang.reflect.Field;
import java.lang.reflect.ReflectPermission;
import java.security.Permission;

public class ImmutableClassTesting {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		CustomImmutable ci = new CustomImmutable("Radhe", 1);
		System.out.println("Old Values : {" + ci.getId() + ", " + ci.getName() + "}");
		//ci.setSecurityManager();
		Field nameField = ci.getClass().getDeclaredField("name");
		// A value of true indicates that the reflected object 
		// should suppress checks for Java language access control when it is used
		nameField.setAccessible(true);
		nameField.set(ci, "Krishna");
	
		Field idField = ci.getClass().getDeclaredField("id");
		idField.setAccessible(true);
		idField.set(ci, 2);
	
		System.out.println("New Values : {" + ci.getId() + ", " + ci.getName() + "}");

	}

	

}

