package com.darkorbit

interface LeaveClanCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var success: Boolean
}
