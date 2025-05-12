package com.darkorbit

interface TitleFrenzyScheduleUpdateCommand : ProtocolPacket {
	var timeToNextWindow: Long
	var timeToWindowEnd: Long
}
