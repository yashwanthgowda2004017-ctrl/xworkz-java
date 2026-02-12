class SmartTv{
static boolean isSwitch;
static boolean onOrOff(){
	if(isSwitch==false){
		isSwitch=true;
		System.out.println("The TV switch is on");
	}
	else if(isSwitch==true){
		 isSwitch=false;
		 System.out.println("The TV switch is off");
		}
	
	 return isSwitch;
}
	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseVolume(){
		System.out.println("invoking the increase volume method");
		if(isSwitch==true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("the volume:"+ currentVolume);
			}
		else{
			System.out.println("reached max volume...");
		}
	   }
	}
	
		public static void decreaseVolume(){
		System.out.println("invoking the decrease  volume method");
		if(isSwitch==true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume-1;
				System.out.println("the volume:"+ currentVolume);
			}
		else{
			System.out.println("reached min volume...");
		}
	   }
	

}

}