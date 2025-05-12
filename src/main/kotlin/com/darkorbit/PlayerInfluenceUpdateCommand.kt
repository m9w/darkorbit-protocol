package com.darkorbit

interface PlayerInfluenceUpdateCommand : ProtocolPacket {
	var playerScore: Long
}
