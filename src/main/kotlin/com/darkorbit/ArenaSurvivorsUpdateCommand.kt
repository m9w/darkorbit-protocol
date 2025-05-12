package com.darkorbit

interface ArenaSurvivorsUpdateCommand : ProtocolPacket {
	var arenaId: Int
	var participants: Int
	var survivors: Int
}
