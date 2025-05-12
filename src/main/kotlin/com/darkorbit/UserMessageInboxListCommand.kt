package com.darkorbit

interface UserMessageInboxListCommand : ProtocolPacket {
	var startIndex: Int
	var userMessageInfoCommandList: MutableList<AbsUserMessageInfoCommand>
}
