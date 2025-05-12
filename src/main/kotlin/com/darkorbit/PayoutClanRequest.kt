package com.darkorbit

interface PayoutClanRequest : ProtocolPacket {
	var amount: Int
	var payoutUserId: Int
	var reason: String
}
