package com.darkorbit

interface LogbookDataListCommand : ProtocolPacket {
	var list: MutableList<LogbookDataCommand>
	var startIndex: Int
	var total: Long
}
