package com.darkorbit

interface SkylabCollectorInfoCommand : ProtocolPacket {
	var leftTime: Long
	var maxTime: Long
	var production: Int
}
