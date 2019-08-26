package com.oroarmor.util;

public class ArrayContains {

	public static <T> boolean contains(T[] array, T value) {
		for(T arrayVal : array) {
			if(arrayVal.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
}
