package com.darkorbit

interface ClanDeleteDiploCommand : ProtocolPacket {
	var baseStackCommand: BaseStackCommand
	var diploId: Int
	var success: Boolean
}
