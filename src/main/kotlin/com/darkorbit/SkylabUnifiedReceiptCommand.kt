package com.darkorbit

interface SkylabUnifiedReceiptCommand : ProtocolPacket {
	var construction: String
	var errorId: MutableList<BaseStackCommand>
	var resultId: Int
	var robotsLeftTimeList: MutableList<SkylabActiveRobotsLeftTimeCommand>
	var subaction: String
	var sucessId: MutableList<BaseStackCommand>
	var transportPrice: Int
}
