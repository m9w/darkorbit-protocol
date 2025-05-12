package com.darkorbit

interface PetGearRemoveCommand : ProtocolPacket {
	var amount: Int
	var gearType: PetGearTypeModule
	var level: Int
}
