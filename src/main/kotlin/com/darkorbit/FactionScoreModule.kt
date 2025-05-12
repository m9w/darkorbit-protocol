package com.darkorbit

interface FactionScoreModule : ProtocolPacket {
	var faction: FactionModule
	var score: Int
}
