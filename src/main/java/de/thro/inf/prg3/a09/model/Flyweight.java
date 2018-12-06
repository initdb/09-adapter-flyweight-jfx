package de.thro.inf.prg3.a09.model;

import de.thro.inf.prg3.a09.resource.ResourceLoader;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Flyweight {
	// intrinsic state
	private final Image image;
	private final ResourceLoader<Image> imageResourceLoader = new ResourceLoader<>(Image::new);;

	Flyweight(String path) throws URISyntaxException {
		// get resource file uri
		File file = new File(getClass().getClassLoader()
			.getResource(path).toURI());

		this.image = imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), path);
		//this.image = ImageIO.read(file);
	}

	public Image getImage() {
		return image;
	}
}
