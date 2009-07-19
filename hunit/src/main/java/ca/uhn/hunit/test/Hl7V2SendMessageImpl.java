package ca.uhn.hunit.test;

import ca.uhn.hunit.xsd.Hl7V2SendMessage;

public class Hl7V2SendMessageImpl extends AbstractSendMessage {

	public Hl7V2SendMessageImpl(TestBatteryImpl theBattery,
			Hl7V2SendMessage theConfig) {
		super(theBattery, theConfig);
	}

	@Override
	public String massageMessage(String theInput) {
		return theInput;
	}


}