package com.darkorbit

interface ClanDeleteOpenDiploCommand : ProtocolPacket {
	var diploId: Int
	var errorMsg: BaseStackCommand
	var success: Boolean
}
