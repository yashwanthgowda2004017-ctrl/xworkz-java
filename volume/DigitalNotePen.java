class DigitalNotePen{
static float f;
static float writeNotWrite(){
	if(f==0.0f){
		f=1.0f;
		System.out.println("Pen writes");
	}
	else if(f==1.0f){
		f=0.0f;
		System.out.println("Pen doesn't writes");
	}
	return f;
  }

	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseSize(){
		System.out.println("invoking the increase volume method");
		if(f==1.0){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("the volume:"+ currentVolume);
			}
		else{
			System.out.println("reached max volume...");
		}
	   }
	}
	
		public static void decreaseSize(){
		System.out.println("invoking the decrease  volume method");
		if(f==1.0){
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