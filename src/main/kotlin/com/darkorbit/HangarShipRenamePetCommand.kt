package com.darkorbit

interface HangarShipRenamePetCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var newName: String
	var resultId: Int
}
