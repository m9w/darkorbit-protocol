package com.darkorbit

interface AbsUserMessageInfoCommand : ProtocolPacket {
	var attachments: MutableList<LootModule>
	var body: String
	var boxId: Long
	var insertDate: String
	var isReceived: Int
	var messageId: Int
	var parent: Boolean
	var replacements: String
	var senderId: Int
	var status: Int
	var subject: String
	var type: Int
}
