package com.darkorbit

interface SpaceBallUpdateScoreCommand : ProtocolPacket {
	var factionId: Int
	var gateId: Int
	var score: Int
}
