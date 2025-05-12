package com.darkorbit

interface EditClanRanksCommand : ProtocolPacket {
	var command: ClanRankListCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
