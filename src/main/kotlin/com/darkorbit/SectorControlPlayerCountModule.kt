package com.darkorbit

interface SectorControlPlayerCountModule : ProtocolPacket {
	var faction: FactionModule
	var maxPlayers: Int
	var playerCount: Int
}
