package com.darkorbit

interface LockAttributeItemRerollRequest : ProtocolPacket {
	var lockIndexList: MutableList<Int>
	var targetItemId: Long
}
