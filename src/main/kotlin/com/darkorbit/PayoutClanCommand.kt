package com.darkorbit

interface PayoutClanCommand : ProtocolPacket {
	var clanInfoCommand: ClanInfoCommand
	var clanTaxLogCommand: ClanTaxLogCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
