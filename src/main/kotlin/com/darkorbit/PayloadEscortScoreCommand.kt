package com.darkorbit

interface PayloadEscortScoreCommand : ProtocolPacket {
	var runScore: Int
	var totalScore: Int
}
