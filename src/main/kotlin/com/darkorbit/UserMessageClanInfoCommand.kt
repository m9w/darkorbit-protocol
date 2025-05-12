package com.darkorbit

interface UserMessageClanInfoCommand : AbsUserMessageInfoCommand {
	var clanTag: String
	var parentMessage: UserMessageParentInfoCommand
	var senderName: String
}
