package com.darkorbit

interface PlutusScoreEntryModule : ProtocolPacket {
	var score: Int
	var timeInSeconds: Int
}
