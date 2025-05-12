package com.darkorbit

interface HangarShipFavouriteCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var resultId: Byte
}
