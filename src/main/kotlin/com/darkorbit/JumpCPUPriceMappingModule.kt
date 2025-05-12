package com.darkorbit

interface JumpCPUPriceMappingModule : ProtocolPacket {
	var mapIdList: MutableList<Int>
	var price: Int
}
