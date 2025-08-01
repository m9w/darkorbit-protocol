package com.darkorbit

interface StrikeAndExitScoreCommand : ProtocolPacket {
	var score: Int
	var uid: Int
}
