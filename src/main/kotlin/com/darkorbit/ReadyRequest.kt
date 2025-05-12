package com.darkorbit

interface ReadyRequest : ProtocolPacket {
	var readyType: ReadyMessage
	var readyTypeStr: String
}
