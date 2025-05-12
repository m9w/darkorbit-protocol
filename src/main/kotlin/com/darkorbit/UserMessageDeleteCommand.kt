package com.darkorbit

interface UserMessageDeleteCommand : ProtocolPacket {
	var count: Int
	var deleteIds: MutableList<Long>
	var inbox: Boolean
	var messageInfoCommands: MutableList<AbsUserMessageInfoCommand>
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
	var unreadCount: Int
}
