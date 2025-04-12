package com.kurs.alerts;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class AlertFactory {
    public static Alert createAlert(AlertType type, String title, String message, ButtonType... buttons) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        if (buttons != null && buttons.length > 0) {
            alert.getButtonTypes().setAll(buttons);
        }
        return alert;
    }

    public static Alert showInfoAlert(String message) {
        return createAlert(AlertType.INFORMATION, "Информация", message, ButtonType.OK);

    }

    public static Alert showWarningAlert(String message) {
        return createAlert(AlertType.WARNING, "Предупреждение", message, ButtonType.OK);
    }

    public static Alert showErrorAlert(String message) {
        return createAlert(AlertType.ERROR, "Ошибка", message, ButtonType.OK, ButtonType.CLOSE);
    }

}
