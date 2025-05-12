package com.darkorbit

interface SkylabPurchaseRobotRequest : ProtocolPacket {
	var construction: String
	var robotType: Int
}
