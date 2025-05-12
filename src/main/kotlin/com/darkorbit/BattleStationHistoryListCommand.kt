package com.darkorbit

interface BattleStationHistoryListCommand : ProtocolPacket {
	var commandList: MutableList<BattleStationHistoryInfoCommand>
	var startIndex: Int
	var total: Int
}
