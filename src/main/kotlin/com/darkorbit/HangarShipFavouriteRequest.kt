package com.darkorbit

interface HangarShipFavouriteRequest : ProtocolPacket {
	var favourite: Byte
	var shipId: Long
}
