package com.darkorbit

interface UserMessageSendRequest : ProtocolPacket {
	var body: String
	var parentId: Int
	var parentType: Int
	var recipientType: String
	var recipients: MutableList<String>
	var subject: String
}
