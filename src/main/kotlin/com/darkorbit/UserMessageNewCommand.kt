package com.darkorbit

interface UserMessageNewCommand : ProtocolPacket {
	var unreadCount: Int
	var userMessageInfoCommand: AbsUserMessageInfoCommand
}
