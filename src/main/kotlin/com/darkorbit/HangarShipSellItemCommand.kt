package com.darkorbit

interface HangarShipSellItemCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var resultId: Int
}
