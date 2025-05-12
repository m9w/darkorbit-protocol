package com.darkorbit

interface LeaderChangeCommand : ProtocolPacket {
	var leaderId: Int
}
