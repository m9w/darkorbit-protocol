package com.darkorbit

interface EnterTrinityTrialsRequest : ProtocolPacket {
	var cannonType: CannonType
	var difficulty: Int
}
