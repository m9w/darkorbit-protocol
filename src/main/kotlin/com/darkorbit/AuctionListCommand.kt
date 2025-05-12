package com.darkorbit

interface AuctionListCommand : ProtocolPacket {
	var auctionList: MutableList<AuctionDataCommand>
	var daySubSec: Int
	var historyList: MutableList<AuctionHistoryCommand>
	var hourSubSec: Int
	var myBidList: MutableList<AuctionDataCommand>
	var weekSubSec: Int
}
