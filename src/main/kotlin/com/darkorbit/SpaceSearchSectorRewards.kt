package com.darkorbit

interface SpaceSearchSectorRewards : ProtocolPacket {
	var count: Int
	var range: Int
	var received: Boolean
	var unlock: Boolean
}
