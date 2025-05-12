package com.darkorbit

interface ClanTaxLogCommand : ProtocolPacket {
	var balanceUserId: Int
	var credits: Long
	var fromName: String
	var insertDate: String
	var moneyType: String
	var reason: String
	var toName: String
}
