package ch06.sec11;

public class Earth {
	//상수
	static final double EARTH_RADIUS=6400;
	//상수
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA=4*EARTH_RADIUS*EARTH_RADIUS*Math.PI;
	}
}