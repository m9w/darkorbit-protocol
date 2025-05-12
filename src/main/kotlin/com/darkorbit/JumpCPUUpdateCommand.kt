package com.darkorbit

interface JumpCPUUpdateCommand : ProtocolPacket {
	var priceList: MutableList<JumpCPUPriceMappingModule>
}
