package com.darkorbit

interface HangarShipImportConfigCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var resultId: Int
	var shipId: Long
}
