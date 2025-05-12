package com.darkorbit

interface SeasonPassRefreshRequest : ProtocolPacket {
	var costType: CostType
	var questId: Int
}
