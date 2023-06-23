package interfaces;

import entities.FireDetector;

public interface FireDetectorFactory {
	FireDetector createFireDetector(String id, double latitude, double longitude, int smokeLevel);
}
