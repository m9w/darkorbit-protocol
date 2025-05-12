package com.darkorbit

interface SpaceBallInitializeScoreCommand : ProtocolPacket {
	var ownerFactionId: Int
	var scoreEarth: Int
	var scoreMars: Int
	var scoreVenus: Int
	var speed: Int
}
