package com.darkorbit

interface HallOfFamePagesRequest : ProtocolPacket {
	var page: Int
	var type: HallOfFamePageType
}
