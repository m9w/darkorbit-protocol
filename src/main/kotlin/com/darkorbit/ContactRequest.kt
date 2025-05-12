package com.darkorbit

interface ContactRequest : ProtocolPacket {
	var contactRequestType: ContactRequestType
	var userId: Int
	var userName: String
}
