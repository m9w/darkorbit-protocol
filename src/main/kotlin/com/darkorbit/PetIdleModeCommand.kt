package com.darkorbit

interface PetIdleModeCommand : ProtocolPacket {
	var isIdle: Boolean
	var petId: Int
}
