package com.darkorbit

interface PlutusInfoCommand : ProtocolPacket {
	var filename: String
	var playerPoints: Int
	var playerRanges: MutableList<RankRewardRangeModule>
	var scoreEntriesList: MutableList<PlutusScoreEntryModule>
	var status: PlutusStatusCommand
}
