package com.darkorbit

interface DisassemblyRequest : ProtocolPacket {
	var itemId: Long
	var recipeLootId: String
}
