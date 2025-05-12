package com.darkorbit

interface EditClanInfoCommand : ProtocolPacket {
	var clanId: Int
	var clanInfoCommand: ClanInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
