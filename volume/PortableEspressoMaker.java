class PortableEspressoMaker{
static long ln=123;
static long carryOrNotCarry(){
	if(ln==123){
		ln=234;
		System.out.println("Carriable");
	}
	else if(ln==234){
		ln=123;
		System.out.println("Not Carriable");
	}
	return ln;
  }
	static int maxVolume = 8;
	static int currentVolume;
	static int minVolume;

	// increase volume
	public static void increaseVolume(){
		System.out.println("invoking the increase volume method");
		if(ln==234){
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
		if(ln==234){
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