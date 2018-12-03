package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class ArcFluorescence extends LightSourceFluorescenceGroup {
	
	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.2333398096;
	private static Double PERCENT_HEIGHT = 0.09928113464;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Fluorescence_Arc.png");
	private static final Image img = new Image(ArcFluorescence.path.toUri()
			.toString());
	
	private final String type;

	public ArcFluorescence(final Double positionX, final Double positionY) {
		super("New ArcFluorescence", ArcFluorescence.TIER, positionX, positionY);
		
		this.type = "type";
		
		this.setPercentSizeWidth(ArcFluorescence.PERCENT_WIDTH);
		this.setPercentSizeHeight(ArcFluorescence.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 2);
		tiers.put("model", 2);
		tiers.put("type", 3);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return ArcFluorescence.img;
	}
}
