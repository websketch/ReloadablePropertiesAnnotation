package com.morgan.design.properties.testBeans;

import org.springframework.stereotype.Component;

import com.morgan.design.properties.ReloadableProperty;

@Component
public class FinalFieldBean {

	@SuppressWarnings("unused")
	@ReloadableProperty("dynamicProperty.intValue")
	private final Integer intObjectProperty = 999;
}
