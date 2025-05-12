package com.darkorbit

interface DispatchMessageCommand : ProtocolPacket {
	var messageType: DispatchMessageCommandMessageType
}
