package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FireDetector {
	@Id
	private String id;
	private double latitude;
	private double longitude;
	private int smokeLevel;

	public FireDetector(String id, double latitude, double longitude, int smokeLevel) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
	}
}
