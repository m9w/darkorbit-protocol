package com.darkorbit

interface DeleteClanMemberCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var removeUserID: Int
	var success: Boolean
}
