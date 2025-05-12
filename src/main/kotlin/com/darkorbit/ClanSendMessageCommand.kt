package com.darkorbit

interface ClanSendMessageCommand : ProtocolPacket {
	var clanMessageInfoCommand: ClanMessageInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
