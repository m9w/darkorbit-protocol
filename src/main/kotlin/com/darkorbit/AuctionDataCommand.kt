package com.darkorbit

interface AuctionDataCommand : ProtocolPacket {
	var amount: Int
	var group: String
	var highestBid: Long
	var highestBidderId: Int
	var highestBidderName: String
	var id: String
	var instantBuy: Boolean
	var myBid: Long
	var price: Long
	var type: String
}
