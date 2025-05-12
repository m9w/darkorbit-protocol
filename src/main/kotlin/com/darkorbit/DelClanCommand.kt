package com.darkorbit

interface DelClanCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var success: Boolean
}
