package com.darkorbit

interface DispatchGateModule : ProtocolPacket {
	var gateId: Short
	var status: DispatchGateModuleStatusType
	var timeLeft: Long
}
