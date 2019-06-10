package com.hikex.htemplate.pojo.mapper.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.hikex.htemplate.pojo.mapper.DataMapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.MappingContextFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Service(value = "dataMapper")
public class DefaultDataMapper extends ConfigurableMapper implements DataMapper {

	private MapperFactory factory;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureFactoryBuilder(final DefaultMapperFactory.Builder factoryBuilder) {
		factoryBuilder.captureFieldContext(true);
	}

	@Override
	protected void configure(MapperFactory factory) {
		this.factory = factory;
	}

	@Override
	public <Source, Target> Target map(Source sourceObject, Class<Target> targetClass, String fields) {
		return map(sourceObject, targetClass);
	}

}
