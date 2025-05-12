package com.darkorbit

interface SkylabRobotPriceCommand : ProtocolPacket {
	var priceType: String
	var value: Int
}
