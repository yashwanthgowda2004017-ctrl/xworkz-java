class DigitalCamera{
static String str[]={"0", "1"};
static int index=0;
static String onOrOff(){
  if(index==0){
	 index=1;
	 System.out.println("The camera is on");
	}
  else if(index==1){
      index=0;
	  System.out.println("The camera is off");
	 }
	return str[index];
  }
	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseVolume(){
		System.out.println("invoking the increase volume method");
		if(index==1){
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
		if(isConnected == true){
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

 }