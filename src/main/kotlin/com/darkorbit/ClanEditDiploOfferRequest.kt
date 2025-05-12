package com.darkorbit

interface ClanEditDiploOfferRequest : ProtocolPacket {
	var diploId: Int
	var status: String
}
