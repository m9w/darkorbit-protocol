package com.darkorbit

interface UserMessageParentInfoCommand : ProtocolPacket {
	var body: String
	var bodyInc: String
	var bodyParams: String
	var senderId: Int
	var senderName: String
	var subject: String
	var subjectInc: String
	var subjectParams: String
	var versionType: Int
}
