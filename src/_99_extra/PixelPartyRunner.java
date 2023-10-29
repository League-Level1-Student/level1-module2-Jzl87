package _99_extra;

public class PixelPartyRunner {
	public static void main(String[] args) {
		PixelParty party = new PixelParty();
		party.setColor(150, 200, 90);
		party.drawRectangle(65, 130, 24, 124);
		party.drawLine(13,57,35,7);
		party.saveImage();
		party.displayImage();
		
	}
}
