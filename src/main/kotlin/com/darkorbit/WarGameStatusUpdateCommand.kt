package com.darkorbit

interface WarGameStatusUpdateCommand : ProtocolPacket {
	var invasionTimeLeft: Int
	var isInvading: Boolean
	var remainingLifes: Int
	var remainingSeconds: Int
	var team: Team
	var waveCount: Int
}
