package com.darkorbit

interface ChangeClanLeaderCommand : ProtocolPacket {
	var command: ClanInfoCommand
	var newLeaderId: Int
	var stack: BaseStackCommand
	var success: Boolean
}
