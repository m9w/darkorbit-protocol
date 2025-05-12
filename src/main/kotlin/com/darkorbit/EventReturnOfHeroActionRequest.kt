package com.darkorbit

interface EventReturnOfHeroActionRequest : ProtocolPacket {
	var actionType: ReturnOfHeroActionType
	var exchange: String
	var id: Int
}
