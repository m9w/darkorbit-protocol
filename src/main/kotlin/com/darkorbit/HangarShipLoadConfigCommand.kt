package com.darkorbit

interface HangarShipLoadConfigCommand : ProtocolPacket {
	var description: BaseStackCommand
	var resultId: Int
	var title: BaseStackCommand
}
