package com.darkorbit

interface XenoResonatorUpgradeResult : ProtocolPacket {
	var consumedItemIds: MutableList<Long>
	var mainItemId: Long
	var newLevel: Int
	var oldLevel: Int
	var status: XenoResonatorUpgradeResultStatus
}
