package com.darkorbit

interface FoundClanCommand : ProtocolPacket {
	var clanId: Int
	var errorMsg: BaseStackCommand
	var success: Boolean
}
