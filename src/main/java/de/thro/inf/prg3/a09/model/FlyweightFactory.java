package de.thro.inf.prg3.a09.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> flyweights = new HashMap<>();

	Flyweight getFlyweight(String path) throws IOException, URISyntaxException {
		if(flyweights.containsKey(path))
			return flyweights.get(path);

		// allocate new flyweight
		Flyweight fw = new Flyweight(path);
		flyweights.put(path, fw);

		return fw;
	}
}
