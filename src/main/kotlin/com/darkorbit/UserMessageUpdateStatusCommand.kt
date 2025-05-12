package com.darkorbit

interface UserMessageUpdateStatusCommand : ProtocolPacket {
	var count: Int
	var ids: MutableList<Long>
	var inbox: Boolean
	var status: Int
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
	var unreadCount: Int
}
