class PowerBank{
static int isBank;
static int getDetails(){
	if(isBank==0){
		isBank=1;
		System.out.println("The power bank is on");
	}
	else if(isBank==1){
		isBank=0;
		System.out.println("The power bank is off");
	}
   return isBank;
  }
	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseVolume(){
		System.out.println("invoking the increase volume method");
		if(isBank==1){
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
		if(isBank==1){
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