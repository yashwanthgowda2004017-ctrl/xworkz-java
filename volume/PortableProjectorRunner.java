class PortableProjectorRunner{
public static void main(String[] args){
 byte ref=PortableProjector.moveOrNotMove();
 System.out.println("The status of projector in byte is:" +ref);

	 PortableProjector.increaseVolume();
		//System.out.println(  Speaker.increaseVolume());
	PortableProjector. decreaseVolume();

 
}
}