package com.example.idcretail.provider;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class StreamHelper {

	public static <T> Stream<T> stream(Iterable<T> entities) {
		return StreamSupport.stream(entities.spliterator(), false);
	}
}
