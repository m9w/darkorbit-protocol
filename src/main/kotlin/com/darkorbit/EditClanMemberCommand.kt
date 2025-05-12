package com.darkorbit

interface EditClanMemberCommand : ProtocolPacket {
	var clanId: Int
	var command: ClanMemberInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
