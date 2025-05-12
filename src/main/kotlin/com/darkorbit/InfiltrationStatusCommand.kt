package com.darkorbit

interface InfiltrationStatusCommand : ProtocolPacket {
	var currentNpcs: Int
	var maxNpcs: Int
	var secondsRemaining: Int
}
