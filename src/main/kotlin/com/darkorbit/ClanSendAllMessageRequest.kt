package com.darkorbit

interface ClanSendAllMessageRequest : ProtocolPacket {
	var msgText: String
	var subject: String
}
