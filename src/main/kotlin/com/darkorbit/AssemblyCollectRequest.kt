package com.darkorbit

interface AssemblyCollectRequest : ProtocolPacket {
	var recipeLootId: String
	var targetItemId: Long
}
