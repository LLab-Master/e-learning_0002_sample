package chapter13;

public class USBUse {

	public static void main(String[] args) {
		USB[] usbParts = {
				new Computer("Sony Vaio", 300),
				new Camera("Cannon"),
				new Refrigerator("USB ミニ冷蔵庫", 2)
		};

		for (USB parts : usbParts) {
			parts.tramsmitData();
		}

	}

}
