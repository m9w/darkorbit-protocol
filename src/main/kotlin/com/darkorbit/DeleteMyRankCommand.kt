package com.darkorbit

interface DeleteMyRankCommand : ProtocolPacket {
	var command: ClanMemberInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
