package com.darkorbit

interface HangarShipImportConfigRequest : ProtocolPacket {
	var originShipId: Long
	var targetShipId: Long
}
