package com.darkorbit

interface TieredArenaEventReputationUpdateCommand : ProtocolPacket {
	var reputation: Int
	var uid: Int
}
