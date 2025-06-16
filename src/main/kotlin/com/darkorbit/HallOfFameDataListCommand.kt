package com.darkorbit

interface HallOfFameDataListCommand : ProtocolPacket {
	var dataList: MutableList<HallOfFameDataCommand>
	var myList: MutableList<HallOfFameDataCommand>
	var pages: MutableList<HallOfFamePages>
	var type: HallOfFameType
}
