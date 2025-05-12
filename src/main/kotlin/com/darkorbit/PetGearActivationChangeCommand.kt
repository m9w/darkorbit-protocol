package com.darkorbit

interface PetGearActivationChangeCommand : ProtocolPacket {
	var active: Boolean
	var gearType: PetGearTypeModule
}
