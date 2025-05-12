package com.darkorbit

interface UserMessageSendCommand : ProtocolPacket {
	var messageInfoCommand: AbsUserMessageInfoCommand
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
}
