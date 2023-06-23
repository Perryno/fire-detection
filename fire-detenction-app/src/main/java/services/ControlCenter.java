package services;

import entities.FireDetector;
import interfaces.FireAlarmListener;

public class ControlCenter implements FireAlarmListener {
	private String name;

	public ControlCenter(String name) {
		this.name = name;
	}

	@Override
	public void onFireAlarm(FireDetector fireDetector) {

		String idSonda = fireDetector.getId();
		double latitude = fireDetector.getLatitude();
		double longitude = fireDetector.getLongitude();
		int smokeLevel = fireDetector.getSmokeLevel();

		String url = "http://host/alarm?idsonda=" + idSonda + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel="
				+ smokeLevel;

		sendNotification(url);
	}

	private void sendNotification(String url) {

		System.out.println("Notifica inviata al personale competente: " + url);
	}
}
