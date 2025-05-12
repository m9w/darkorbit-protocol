package com.darkorbit

interface SpacePlagueRatingStatusCommand : ProtocolPacket {
	var healthyPoints: Int
	var infectedPoints: Int
}
