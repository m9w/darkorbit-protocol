package com.darkorbit

interface PetFuelUpdateCommand : ProtocolPacket {
	var petFuelMax: Int
	var petFuelNow: Int
}
