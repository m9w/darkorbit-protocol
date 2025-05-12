package com.darkorbit

interface HangarShipSellDroneCommand : ProtocolPacket {
	var drones: MutableList<HangarShipDroneView>
	var errorMessage: BaseStackCommand
	var resultId: Int
}
