package com.darkorbit

interface ApplyAcceptCommand : ProtocolPacket {
	var applyId: Int
	var command: ClanMemberListCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
