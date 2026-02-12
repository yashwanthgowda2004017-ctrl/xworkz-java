class FoldableBluetoothKeyboard{
static double FBK=3.14d;
static double openOrClose(){
	if(FBK==3.14d){
		FBK=3.15d;
		System.out.println("FBK is open");
	}
	else if(FBK==3.15d){
		 FBK=3.14d;
		 System.out.println("FBK is closed");
		}
	return FBK;
	}
	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseVolume(){
		System.out.println("invoking the increase volume method");
		if(FBK==3.15d){
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
		if(FBK==3.15d){
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