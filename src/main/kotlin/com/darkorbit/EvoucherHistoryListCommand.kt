package com.darkorbit

interface EvoucherHistoryListCommand : ProtocolPacket {
	var list: MutableList<EvoucherHistoryInfoCommand>
}
