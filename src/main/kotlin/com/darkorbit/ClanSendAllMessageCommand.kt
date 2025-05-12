package com.darkorbit

interface ClanSendAllMessageCommand : ProtocolPacket {
	var clanMessageInfoCommand: ClanMessageInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
