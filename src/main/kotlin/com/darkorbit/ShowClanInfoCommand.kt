package com.darkorbit

interface ShowClanInfoCommand : ProtocolPacket {
	var clanInfoCommand: ClanInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
