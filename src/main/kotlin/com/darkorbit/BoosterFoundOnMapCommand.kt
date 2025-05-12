package com.darkorbit

interface BoosterFoundOnMapCommand : ProtocolPacket {
	var hours: Int
	var lootId: String
}
