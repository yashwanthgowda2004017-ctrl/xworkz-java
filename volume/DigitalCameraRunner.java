class DigitalCameraRunner{
public static void main(String[] args){
	String ref=DigitalCamera.onOrOff();
	System.out.println("The status of camera is:" +ref);

	 DigitalCamera.increaseBrightnes();
		//System.out.println(  Speaker.increaseVolume());
	DigitalCamera. decreaseBrightnes();

}
}