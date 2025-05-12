package com.darkorbit

interface HallOfFameDataListCommand : ProtocolPacket {
	var dataList: MutableList<HallOfFameDataCommand>
	var type: HallOfFameType
}
