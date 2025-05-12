package com.darkorbit

interface LootModule : ProtocolPacket {
	var amount: Int
	var lootId: String
	var modifier: String
}
