package com.darkorbit

interface PetIsDestroyedCommand : ProtocolPacket {
	var destroyedType: DestroyedType
}
