package com.darkorbit

interface CountdownStatusCommand : ProtocolPacket {
	var currentAmount: Int
	var maxAmount: Int
	var type: CountdownStatusTypeModule
}
