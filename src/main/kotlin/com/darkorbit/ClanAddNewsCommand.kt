package com.darkorbit

interface ClanAddNewsCommand : ProtocolPacket {
	var clanNewsInfoCommand: ClanNewsInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
