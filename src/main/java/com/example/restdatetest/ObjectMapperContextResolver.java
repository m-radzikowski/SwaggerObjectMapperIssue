package com.example.restdatetest;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.SimpleDateFormat;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 * @author Maciej Radzikowski
 */
@Provider
public class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {

	private final ObjectMapper mapper;

	public ObjectMapperContextResolver() {
		mapper = new ObjectMapper();
//		mapper.findAndRegisterModules();
//		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"));

//		SimpleModule testModule = new SimpleModule("MyModule", new Version(1, 0, 0, null));
//		testModule.addSerializer(new JsonDateSerializer());
//		mapper.registerModule(testModule);
	}

	@Override
	public ObjectMapper getContext(Class<?> type) {
		return mapper;
	}

}
