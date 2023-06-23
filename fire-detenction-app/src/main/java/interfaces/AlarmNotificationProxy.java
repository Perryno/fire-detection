package interfaces;

import entities.FireDetector;

public interface AlarmNotificationProxy {
	void sendAlarmNotification(FireDetector fireDetector);
}
