package com.darkorbit

interface OrePriceModule : ProtocolPacket {
	var oreType: OreTypeModule
	var price: Int
}
