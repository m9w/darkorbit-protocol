package com.darkorbit

interface ApplyDeclineCommand : ProtocolPacket {
	var applyId: Int
	var errorMsg: BaseStackCommand
	var success: Boolean
}
