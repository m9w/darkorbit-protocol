package com.darkorbit

interface UnstableModuleRestabiliseRequest : ProtocolPacket {
	var isSalvage: Boolean
	var itemId: Int
}
