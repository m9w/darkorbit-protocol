package com.darkorbit

interface PetRequest : ProtocolPacket {
	var petRequestType: PetRequestType
}
