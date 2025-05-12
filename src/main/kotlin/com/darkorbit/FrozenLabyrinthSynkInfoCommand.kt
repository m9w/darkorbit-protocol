package com.darkorbit

interface FrozenLabyrinthSynkInfoCommand : ProtocolPacket {
	var isGateActive: Boolean
	var mapName: String
	var respawnInSeconds: Long
	var zone: Int
}
