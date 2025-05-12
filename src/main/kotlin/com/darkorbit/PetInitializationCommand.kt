package com.darkorbit

interface PetInitializationCommand : ProtocolPacket {
	var hasFuel: Boolean
	var hasPet: Boolean
	var petIsAlive: Boolean
}
