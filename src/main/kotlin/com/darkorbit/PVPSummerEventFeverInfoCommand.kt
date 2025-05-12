package com.darkorbit

interface PVPSummerEventFeverInfoCommand : ProtocolPacket {
	var timeToEndFever: Long
	var timeToNextFever: Long
}
