package com.darkorbit

interface HallOfFamePages : ProtocolPacket {
	var currentPage: Int
	var dataList: MutableList<HallOfFameDataCommand>
	var pageSize: Int
	var pageType: String
	var totalPage: Int
	var type: HallOfFamePageType
}
