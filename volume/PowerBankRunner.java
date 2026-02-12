class PowerBankRunner{
public static void main(String[] args){
   int ref=PowerBank.getDetails();
   System.out.println("The status of power bank is:" +ref);

	 PowerBank.increaseVolume();
		//System.out.println(  Speaker.increaseVolume());
	PowerBank. decreaseVolume();

}
}