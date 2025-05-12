package com.darkorbit

interface ClanMessageInfoCommand : ProtocolPacket {
	var insertDate: String
	var mailText: String
	var messageId: Int
	var sendUserId: Int
	var sendUserName: String
	var subject: String
	var subjectIncName: String
	var subjectParams: String
	var textIncName: String
	var textParams: String
	var type: Int
}
