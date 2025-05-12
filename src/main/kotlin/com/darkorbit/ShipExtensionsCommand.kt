package com.darkorbit

interface ShipExtensionsCommand : ProtocolPacket {
	var extensionStage: Int
	var userId: Int
}
