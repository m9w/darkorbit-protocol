package com.darkorbit

interface WarGameScoreUpdateCommand : ProtocolPacket {
	var score: Int
	var teamBlueScore: Int
	var teamRedScore: Int
}
