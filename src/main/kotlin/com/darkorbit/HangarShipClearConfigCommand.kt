package com.darkorbit

interface HangarShipClearConfigCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var resultId: Int
}
