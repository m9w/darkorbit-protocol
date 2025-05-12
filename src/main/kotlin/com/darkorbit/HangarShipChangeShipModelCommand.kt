package com.darkorbit

interface HangarShipChangeShipModelCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var resultId: Int
}
