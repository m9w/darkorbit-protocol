package com.darkorbit

interface TradeReplyCommand : ProtocolPacket {
	var priceInfos: MutableList<OrePriceModule>
}
