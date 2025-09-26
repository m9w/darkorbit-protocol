package com.darkorbit

interface PlanetCommand : ProtocolPacket {
	var increase: Int
	var planetId: Int
	var planetPct: Int
}
