package de.thro.inf.prg3.a09.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Flyweight {
	// intrinsic state
	private final Image image;

	Flyweight(String path) throws URISyntaxException, IOException {
		// get resource file uri
		File file = new File(getClass().getClassLoader()
			.getResource(path).toURI());

		this.image = ImageIO.read(file);
	}
}
