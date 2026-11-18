package com.darkorbit

interface XenoResonatorUpgradeRequest : ProtocolPacket {
	var mainItemId: Long
	var materialItemIds: MutableList<Long>
}
