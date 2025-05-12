package com.darkorbit

interface AbsUserMessageInfoCommand : ProtocolPacket {
	var body: String
	var boxId: Long
	var insertDate: String
	var messageId: Int
	var parent: Boolean
	var senderId: Int
	var status: Int
	var subject: String
	var type: Int
}
