package com.darkorbit

interface ShipWarpCompletedCommand : ProtocolPacket {
	var currentShipLootId: String
}
