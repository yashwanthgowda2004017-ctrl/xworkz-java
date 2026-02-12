class VoiceTranslatorEarbudsRunner{
public static void main(String[] args){
 boolean ref=VoiceTranslatorEarbuds. workOrNotWork();
 System.out.println("The status of buds is:" +ref);

	VoiceTranslatorEarbuds.increaseVolume();
		//System.out.println(  Speaker.increaseVolume());
	VoiceTranslatorEarbuds. decreaseVolume();
}
}