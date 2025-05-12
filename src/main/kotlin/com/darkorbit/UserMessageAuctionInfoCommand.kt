package com.darkorbit

interface UserMessageAuctionInfoCommand : AbsUserMessageInfoCommand {
	var amount: Int
	var auctionId: Int
	var auctionType: String
	var lootId: String
	var msgType: Int
}
