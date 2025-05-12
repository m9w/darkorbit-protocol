package com.darkorbit

interface ArenaMatchResultModule : ProtocolPacket {
	var damageDealt: Int
	var damageRecieved: Int
	var durationInSeconds: Int
	var peakDamage: Int
	var playerName: String
}
