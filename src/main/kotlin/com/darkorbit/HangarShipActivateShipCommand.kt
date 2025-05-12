package com.darkorbit

interface HangarShipActivateShipCommand : ProtocolPacket {
	var currentShipLootId: String
	var errorMessage: BaseStackCommand
	var result: Int
	var successMessage: BaseStackCommand
}
