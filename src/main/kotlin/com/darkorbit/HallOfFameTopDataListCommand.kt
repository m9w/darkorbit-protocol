package com.darkorbit

interface HallOfFameTopDataListCommand : ProtocolPacket {
	var allRankList: MutableList<HallOfFameDataCommand>
	var myRankList: MutableList<HallOfFameDataCommand>
	var myRankingPoints: HallOfFameRankingPoints
	var pages: MutableList<HallOfFamePages>
	var type: TopReqType
}
