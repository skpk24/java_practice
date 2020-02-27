package com.ilinks.practice.java.immutable;

import java.lang.reflect.ReflectPermission;
import java.security.Permission;

public final class CustomImmutable {
	
	

	private final String name;
	
	private final int id;

	public CustomImmutable(String name, int id) {
		this.name = name;
		this.id = id;
		
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if(permission.getClass() == ReflectPermission.class && "suppressAccessChecks".equals(permission.getName())) {
					throw new SecurityException("can't supress AccessChecks");
				}
			}
		});
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public static void setSecurityManager() {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if(permission.getClass() == ReflectPermission.class && "suppressAccessChecks".equals(permission.getName())) {
					throw new SecurityException("can't supress AccessChecks");
				}
			}
		});
	}
}
