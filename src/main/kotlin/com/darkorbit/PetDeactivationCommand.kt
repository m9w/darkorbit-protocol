package com.darkorbit

interface PetDeactivationCommand : ProtocolPacket {
	var petId: Int
}
