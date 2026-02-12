class VoiceTranslatorEarbuds{
static boolean Earbuds;
static boolean workOrNotWork(){
	if(Earbuds==false){
		Earbuds=true;
		System.out.println("Buds works");
	}
	else if(Earbuds==true){
		Earbuds=false;
		System.out.println("Buds not works");
	}
   return Earbuds;
  }
	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseVolume(){
		System.out.println("invoking the increase volume method");
		if(Earbuds==true){
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
		if(Earbuds==true){
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