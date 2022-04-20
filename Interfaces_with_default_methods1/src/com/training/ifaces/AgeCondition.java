package com.training.ifaces;

public interface AgeCondition<T> {
	
	public default boolean negate(Double age) {
		return age<58;
	}

}
