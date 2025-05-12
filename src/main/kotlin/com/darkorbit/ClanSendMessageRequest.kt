package com.darkorbit

interface ClanSendMessageRequest : ProtocolPacket {
	var msgText: String
	var subject: String
	var toUserId: Int
}
