package com.training.ifaces;
@FunctionalInterface
public interface Converter<T,R> {

	public R convert(T value);
	//public R convert(T value);
	
	
}