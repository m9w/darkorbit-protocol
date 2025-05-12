package com.darkorbit

interface PetGearAddCommand : ProtocolPacket {
	var amount: Int
	var enabled: Boolean
	var gearType: PetGearTypeModule
	var level: Int
}
