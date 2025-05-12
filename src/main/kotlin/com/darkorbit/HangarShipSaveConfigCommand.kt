package com.darkorbit

interface HangarShipSaveConfigCommand : ProtocolPacket {
	var description: BaseStackCommand
	var resultId: Int
	var title: BaseStackCommand
}
