package com.darkorbit

interface AssemblySkipRequest : ProtocolPacket {
	var recipeLootId: String
	var targetItemId: Long
}
