package com.darkorbit

interface EventLootShowCommand : ProtocolPacket {
	var bg: String
	var lootAmount: Int
	var lootId: String
}
