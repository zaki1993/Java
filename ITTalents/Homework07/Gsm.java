public class Gsm {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	void insertSimCard(String _simMobileNumber){
		if(_simMobileNumber.indexOf("08") == 0 && _simMobileNumber.length() == 10){
			simMobileNumber = _simMobileNumber;
			hasSimCard = true;
		}
		else{
			System.out.println("Invalid phone number!");
		}
	}
	void removeSimCard(){
		simMobileNumber = "";
		hasSimCard = false;
	}
	void call(Gsm receiver, int duration){
		if(duration > 0 && simMobileNumber != receiver.simMobileNumber && hasSimCard && receiver.hasSimCard){
			//this != receiver
			lastOutgoingCall.receiver = receiver;
			lastOutgoingCall.caller = this;
			lastOutgoingCall.duration = duration;
			receiver.lastIncomingCall.duration = duration;
			receiver.lastIncomingCall.caller = this;
			receiver.lastIncomingCall.receiver = receiver;
			outgoingCallsDuration += lastOutgoingCall.duration;
		}
		else{
			System.out.println("Invalid call!");
		}
	}
	float getSumForCall(){
		return outgoingCallsDuration*lastOutgoingCall.priceForAMinute;
	}
	void printInfoForTheLastOutgoingCall(){
		if(lastOutgoingCall != null){
			System.out.println("Duration: " + lastOutgoingCall.duration +
								"caller: " + lastOutgoingCall.caller +
								"receiver: " + lastOutgoingCall.receiver + 
								"price: " + lastOutgoingCall.priceForAMinute);
		}
		else{
			System.out.println("There is no outgoing call!");
		}
	}
	void printInfoForTheLastIncomingCall(){
		if(lastIncomingCall != null){
			System.out.println("Duration: " + lastIncomingCall.duration +
								"caller: " + lastIncomingCall.caller +
								"receiver: " + lastIncomingCall.receiver + 
								"price: " + lastIncomingCall.priceForAMinute);
		}
		else{
			System.out.println("There is no outgoing call!");
		}
	}
}
