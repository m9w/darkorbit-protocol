package com.darkorbit

interface PetGearSelectCommand : ProtocolPacket {
	var gearType: PetGearTypeModule
	var optionalParams: MutableList<Int>
}
