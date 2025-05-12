package com.darkorbit

interface HangarShipUnlockSlotCommand : ProtocolPacket {
	var errorMessage: BaseStackCommand
	var nextGearsSlotUridium: Int
	var nextGeneratorSlotUridium: Int
	var nextHeatSlotUridium: Int
	var nextLasersSlotUridium: Int
	var nextProtocolsSlotUridium: Int
	var resultId: Int
}
