import drum.DrumKit;

class DrumKitTestDrive {
	public static void main(String[] args) {
	
	
	DrumKit d = new DrumKit();
	
	d.snare = true;
	
	if (d.snare == true) {
	d.playSnaze();
	}
	
	d.playTopHat();
	
}
}