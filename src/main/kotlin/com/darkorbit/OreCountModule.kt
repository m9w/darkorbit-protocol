package com.darkorbit

interface OreCountModule : ProtocolPacket {
	var count: Long
	var oreType: OreTypeModule
}
