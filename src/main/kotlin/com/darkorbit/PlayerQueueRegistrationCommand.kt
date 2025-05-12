package com.darkorbit

interface PlayerQueueRegistrationCommand : ProtocolPacket {
	var gateId: Int
	var positionInQueue: Int
}
