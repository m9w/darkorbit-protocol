package com.darkorbit

interface UserMessageOutboxListRequest : ProtocolPacket {
	var startIndex: Int
}
