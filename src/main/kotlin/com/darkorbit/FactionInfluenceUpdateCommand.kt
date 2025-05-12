package com.darkorbit

interface FactionInfluenceUpdateCommand : ProtocolPacket {
	var eicScore: Long
	var mmoScore: Long
	var vruScore: Long
}
