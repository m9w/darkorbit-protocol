package com.darkorbit

interface PetShieldUpdateCommand : ProtocolPacket {
	var petShieldMax: Int
	var petShieldNow: Int
}
