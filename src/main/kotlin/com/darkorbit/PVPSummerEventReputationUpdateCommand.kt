package com.darkorbit

interface PVPSummerEventReputationUpdateCommand : ProtocolPacket {
	var reputation: Int
	var uid: Int
}
