package com.darkorbit

interface UnstableModuleRerollRequest : ProtocolPacket {
	var itemId: Int
	var rerollCost: Int
	var rerollCount: Int
}
