package com.darkorbit

interface EventProgressUpdateCommand : ProtocolPacket {
	var id: String
	var progress: Int
	var statusCode: Int
}
