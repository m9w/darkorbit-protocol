package com.darkorbit

interface XenoResonatorEffectRequest : ProtocolPacket {
	var itemId: Long
	var materialLootId: String
	var operation: Operation
}
