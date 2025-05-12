package com.darkorbit

interface MessageQueueModule : ProtocolPacket {
	var messageQueue: MutableList<ActivationRequest>
}
