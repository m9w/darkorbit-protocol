package com.darkorbit

interface SynthesisCostLootCommand : ProtocolPacket {
	var amount: Int
	var certain: Boolean
	var lootId: String
}
