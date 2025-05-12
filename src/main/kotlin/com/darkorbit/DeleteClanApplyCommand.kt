package com.darkorbit

interface DeleteClanApplyCommand : ProtocolPacket {
	var applyId: Int
	var errorMsg: BaseStackCommand
	var success: Boolean
}
