package com.darkorbit

interface UserMessageInfoCommand : AbsUserMessageInfoCommand {
	var bodyInc: String
	var bodyParams: String
	var parentMessage: UserMessageParentInfoCommand
	var recipientIds: MutableList<Int>
	var recipients: MutableList<String>
	var senderAvatar: String
	var senderName: String
	var subjectInc: String
	var subjectParams: String
	var title: String
	var versionType: Int
}
