package com.darkorbit

interface HangarShipMoveItemsCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var result: Int
}
