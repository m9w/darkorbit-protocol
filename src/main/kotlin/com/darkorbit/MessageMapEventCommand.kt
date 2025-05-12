package com.darkorbit

interface MessageMapEventCommand : ProtocolPacket {
	var message: String
	var priority: Int
	var replacementObjectList: MutableList<String>
	var type: MessageMapEventCommandMessageType
}
