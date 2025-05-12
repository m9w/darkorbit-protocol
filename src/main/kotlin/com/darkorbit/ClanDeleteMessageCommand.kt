package com.darkorbit

interface ClanDeleteMessageCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var messageId: Int
	var success: Boolean
}
