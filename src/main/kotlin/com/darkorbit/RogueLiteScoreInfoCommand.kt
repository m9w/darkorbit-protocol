package com.darkorbit

interface RogueLiteScoreInfoCommand : ProtocolPacket {
	var progress: Int
	var score: Int
}
