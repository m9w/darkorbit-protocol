package com.darkorbit

interface SpaceSearchInfoCommand : ProtocolPacket {
	var cost: Long
	var lootId: String
	var planetIndex: Int
	var planetPct: Int
	var quantity: Long
}
