package com.darkorbit

interface SkylabStorageOreCommand : ProtocolPacket {
	var capacity: Int
	var current: Int
	var oreId: Int
	var oreName: String
}
