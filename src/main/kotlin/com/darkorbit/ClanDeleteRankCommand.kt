package com.darkorbit

interface ClanDeleteRankCommand : ProtocolPacket {
	var clanRankListCommand: ClanRankListCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
