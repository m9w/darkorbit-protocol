package com.darkorbit

interface PVPSummerEventSelfReputationUpdateCommand : ProtocolPacket {
	var nextMilestone: Int
	var repPerKill: Int
	var reputation: Int
}
