import java.lang.Math;

public class CylinderVolume {
	public double calculateCylinderVolume(double radius, int height) {
		return Math.PI*radius*radius*height;
	}
	
	public static void main(String[] args) {
		CylinderVolume volume = new CylinderVolume();
		System.out.println(volume.calculateCylinderVolume(2, 3));	
	}
}