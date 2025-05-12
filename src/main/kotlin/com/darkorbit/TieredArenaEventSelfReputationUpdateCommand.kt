package com.darkorbit

interface TieredArenaEventSelfReputationUpdateCommand : ProtocolPacket {
	var participationReputation: Int
	var reputation: Int
}
