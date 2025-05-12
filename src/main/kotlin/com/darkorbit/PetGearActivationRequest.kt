package com.darkorbit

interface PetGearActivationRequest : ProtocolPacket {
	var gearTypeToActivate: PetGearTypeModule
	var optParam: Short
}
