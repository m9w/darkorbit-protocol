package com.darkorbit

interface AssemblyBuildRequest : ProtocolPacket {
	var amount: Long
	var recipeLootId: String
	var targetItemId: Long
}
