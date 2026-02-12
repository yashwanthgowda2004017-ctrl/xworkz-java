class PortableProjector{
static byte by[]={2,4};
static int index=0;
static byte moveOrNotMove(){
	if(index==0){
		index=1;
		System.out.println("The projector can move");
	}
	else if(index==1){
		index=0;
		System.out.println("The projector can't move");
	}
	return by[index];
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
		if(index==1){
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