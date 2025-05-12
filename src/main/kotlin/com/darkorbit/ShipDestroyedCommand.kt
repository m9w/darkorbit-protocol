package com.darkorbit

interface ShipDestroyedCommand : ProtocolPacket {
	var destroyedUserId: Int
	var explosionTypeId: Int
}
