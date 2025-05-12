package com.darkorbit

interface ApplyClanCommand : ProtocolPacket {
	var applyId: Int
	var clanId: Int
	var credits: Int
	var errorMsg: BaseStackCommand
	var success: Boolean
}
