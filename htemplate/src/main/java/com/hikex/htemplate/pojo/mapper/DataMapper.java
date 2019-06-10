package com.hikex.htemplate.pojo.mapper;

public interface DataMapper {

	/**
	 * This will Map Source Object to the Target POJO class and will return that
	 * POJO class.
	 * 
	 * @param sourceObject
	 * @param targetClass
	 * @return
	 */
	<Source, Target> Target map(Source sourceObject, Class<Target> targetClass);

	/**
	 * This will map only the fields from source object to target object.
	 * 
	 * @param sourceObject
	 * @param targetClass
	 * @param fields
	 * @return
	 */
	<Source, Target> Target map(Source sourceObject, Class<Target> targetClass, String fields);

}
