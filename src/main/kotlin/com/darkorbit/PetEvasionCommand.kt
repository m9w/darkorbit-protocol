package com.darkorbit

interface PetEvasionCommand : ProtocolPacket {
	var evasionActive: Boolean
	var petId: Int
}
