package com.darkorbit

interface ClanNewRankCommand : ProtocolPacket {
	var command: ClanRankListCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
