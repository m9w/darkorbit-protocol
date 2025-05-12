package com.darkorbit

interface ClanDeleteAllMessageCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var success: Boolean
}
