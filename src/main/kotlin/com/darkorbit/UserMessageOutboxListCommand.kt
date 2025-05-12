package com.darkorbit

interface UserMessageOutboxListCommand : ProtocolPacket {
	var startIndex: Int
	var userMessageInfoCommandList: MutableList<AbsUserMessageInfoCommand>
}
