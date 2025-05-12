package com.darkorbit

interface DeleteClanCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var success: Boolean
}
