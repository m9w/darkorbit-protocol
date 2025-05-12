package com.darkorbit

interface SpacePlagueInfectionStatusCommand : ProtocolPacket {
	var infected: Boolean
	var remainingTime: Int
}
