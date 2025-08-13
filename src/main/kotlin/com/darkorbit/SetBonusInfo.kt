package com.darkorbit

interface SetBonusInfo : ProtocolPacket {
	var setBonusId: setBonusId
	var showValue: MutableList<Int>
}
